# Help

## Running the tests

We use [pytest][pytest: Getting Started Guide] as our website test runner.
You will need to install `pytest` on your development machine if you want to run tests for the Python track locally.
You should also install the following `pytest` plugins:

- [pytest-cache][pytest-cache]
- [pytest-subtests][pytest-subtests]

Extended information can be found in our website [Python testing guide][Python track tests page].


### Running Tests

To run the included tests, navigate to the folder where the exercise is stored using `cd` in your terminal (_replace `{exercise-folder-location}` below with your path_).
Test files usually end in `_test.py`, and are the same tests that run on the website when a solution is uploaded.

Linux/MacOS
```bash
$ cd {path/to/your-folder-location}
```

Windows
```powershell
PS C:\Users\foobar> cd {path\to\your-folder-location}
```

<br>

Next, run the `pytest` command in your terminal, replacing:

Linux/MacOS
```bash
$ python3 -m pytest  sandpile_test.py
==================== 7 passed in 0.08s ====================
```

Windows
```powershell
PS C:\Users\foobar> py -m pytest  sandpile_test.py
==================== 7 passed in 0.08s ====================
```


### Common options
- `-o` : override default `pytest.ini` (_you can use this to avoid marker warnings_)
- `-v` : enable verbose output.
- `-x` : stop running tests on first failure.
- `--ff` : run failures from previous test before running other test cases.

For additional options, use `python3 -m pytest -h` or `py -m pytest -h`.

