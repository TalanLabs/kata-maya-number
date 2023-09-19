import { add, divide, multiply, subtract } from './maya'

describe('maya calculation', () => {
  test('simple addition', () => {
    const num1 = ['o...', '....', '....', '....']
    const num2 = ['o...', '....', '....', '....']
    const expected = ['oo..', '....', '....', '....']
    expect(add(num1, num2)).toEqual(expected)
  })

  test('addition with carry', () => {
    const num1 = ['ooo.', '____', '____', '____']
    const num2 = ['ooo.', '....', '....', '....']
    const expected = [
      'o...', '....', '....', '....',
      'o...', '....', '....', '....'
    ]
    expect(add(num1, num2)).toEqual(expected)
  })

  test('simple multiplication', () => {
    const num1 = ['....', '____', '....', '....']
    const num2 = ['....', '____', '....', '....']

    const expected = [
      'o...', '....', '....', '....',
      '....', '____', '....', '....'
    ]

    expect(multiply(num1, num2)).toEqual(expected)
  })

  test('simple substraction', () => {
    const num1 = ['o...', '....', '....', '....']
    const num2 = ['o...', '....', '....', '....']
    const expected = ['....', '____', '....', '....']

    expect(subtract(num1, num2)).toEqual(expected)
  })

  test('more complex subtraction', () => {
    const num1 = [
      'o...', '____', '....', '....',
      'ooo.', '....', '....', '....'
    ]

    const num2 = ['oo..', '____', '....', '....']

    const expected = [
      '....', '____', '....', '....',
      'o...', '____', '____', '____'
    ]

    expect(subtract(num1, num2)).toEqual(expected)
  })

  test('simple division', () => {
    const num1 = ['ooo.', '____', '....', '....']
    const num2 = ['oooo', '....', '....', '....']
    const expected = ['oo..', '....', '....', '....']

    expect(divide(num1, num2)).toEqual(expected)
  })

  test('more complex division', () => {
    const num1 = [
      'oooo', '....', '....', '....',
      'ooo.', '____', '....', '....',
      '.oo.', 'o..o', '.oo.', '....'
    ]

    const num2 = ['....', '____', '____', '....']

    const expected = [
      'ooo.', '____', '....', '....',
      'o...', '____', '____', '____'
    ]

    expect(divide(num1, num2)).toEqual(expected)
  })
})
