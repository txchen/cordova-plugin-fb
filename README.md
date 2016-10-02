# cordova-plugin-fb

Use facebook android sdk in your cordova app.

## Installation

Declare the plugin in your config.xml

```xml
<plugin name="cordova-plugin-fb" spec="~1.0.7">
    <variable name="FB_APP_ID" value="YOUR_FB_APP_ID" />
</plugin>
```

Then run `cordova prepare` to pull the plugin src down to your project.

## Usage

### send activate app event

```js
fb.sendActivateAppEvent()
```
