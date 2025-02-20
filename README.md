# IntelliJ IDEA + Protobuf

Repro instructions:

* Import the project in IntelliJ IDEA with the protobuf plugin enabled.
* In `App.kt` Command/Ctrl-Click `setName("...")`
    * ❌ Observe that you get taken to generated code, with no immediate ability to navigate to the `name` property in
      the `.proto` file.
* In `App.kt` Command/Ctrl-Click `MyMessage`
    * ✅ Observe that here you have a gutter item to navigate to `message MyMessage` in the `.proto` (good!)
* In `App.kt` Command/Ctrl-Click `myMessage { ... }` (the Kotlin DSL builder)
    * ❌ Observe that navigation doesn't work here at all, neither for the message builder nor its fields.
* In `msg.proto` Command/Ctrl-Click `name` or `MyMessage`
    * ✅ Observe that this lists usages, both for the property and the message
        * ❌ Though this spams a lot of generated code, with the actual usages last, and filtering out generated code
          doesn't seem to work.
    * ❌ Observe that this does not find Kotlin DSL usages
