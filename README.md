# Kotlin MutableList map() Unexpected Behavior

This repository demonstrates a common misconception in Kotlin regarding the `map()` function and `MutableList`.  Many developers assume `map()` modifies the original list, but this is incorrect. `map()` returns a *new* list containing the transformed elements, leaving the original list unchanged.

The `bug.kt` file shows the unexpected behavior. The `bugSolution.kt` file provides the correct way to modify a `MutableList` in place.