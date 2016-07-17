package com.github.yacchin1205.naoqi_wrapper_sample;

import com.aldebaran.qi.AnyObject;
import com.aldebaran.qi.Future;
import com.aldebaran.qi.QiSignalListener;
import com.aldebaran.qi.QiSignalConnection;

public class ALTextToSpeech {

    public static final String MODULE_NAME = "ALTextToSpeech";

    private AnyObject _module;

    public ALTextToSpeech(AnyObject module) {
        this._module = module;
    }



    /**
     * Exits and unregisters the module.
     * 
     * @return  - Void
     */
    public Future<Void> exit() {
        return _module.call(Void.class, "exit");
    }


    /**
     * NAOqi1 pCall method.
     */
    public Future<Object> getPCall() {
        return _module.getProperty(Object.class, "pCall");
    }

    /**
     * NAOqi1 pCall method.
     */
    public Future<Void> setPCall(Object value) {
        return _module.setProperty("pCall", value);
    }


    /**
     * Returns the version of the module.
     * 
     * @return A string containing the version of the module. - String
     */
    public Future<String> version() {
        return _module.call(String.class, "version");
    }


    /**
     * Just a ping. Always returns true
     * 
     * @return returns true - Bool
     */
    public Future<Boolean> ping() {
        return _module.call(Boolean.class, "ping");
    }


    /**
     * Retrieves the module's method list.
     * 
     * @return An array of method names. - List<String>
     */
    public Future<java.util.List> getMethodList() {
        return _module.call(java.util.List.class, "getMethodList");
    }


    /**
     * Retrieves a method's description.
     * 
     * @param methodName The name of the method. - String
     * @return A structure containing the method's description. - Value
     */
    public Future<Object> getMethodHelp(String methodName) {
        return _module.call(Object.class, "getMethodHelp", methodName);
    }


    /**
     * Retrieves the module's description.
     * 
     * @return A structure describing the module. - Value
     */
    public Future<Object> getModuleHelp() {
        return _module.call(Object.class, "getModuleHelp");
    }


    /**
     * Wait for the end of a long running method that was called using 'post'
     * 
     * @param id The ID of the method that was returned when calling the method using 'post' - Int32
     * @param timeoutPeriod The timeout period in ms. To wait indefinately, use a timeoutPeriod of zero. - Int32
     * @return True if the timeout period terminated. False if the method returned. - Bool
     */
    public Future<Boolean> wait(int id, int timeoutPeriod) {
        return _module.call(Boolean.class, "wait", id, timeoutPeriod);
    }


    /**
     * Wait for the end of a long running method that was called using 'post'
     * 
     * @param id The ID of the method that was returned when calling the method using 'post' - Int32
     * @return True if the timeout period terminated. False if the method returned. - Void
     */
    public Future<Void> wait(int id) {
        return _module.call(Void.class, "wait", id);
    }


    /**
     * Returns true if the method is currently running.
     * 
     * @param id The ID of the method that was returned when calling the method using 'post' - Int32
     * @return True if the method is currently running - Bool
     */
    public Future<Boolean> isRunning(int id) {
        return _module.call(Boolean.class, "isRunning", id);
    }


    /**
     * returns true if the method is currently running
     * 
     * @param id the ID of the method to wait for - Int32
     * @return  - Void
     */
    public Future<Void> stop(int id) {
        return _module.call(Void.class, "stop", id);
    }


    /**
     * Gets the name of the parent broker.
     * 
     * @return The name of the parent broker. - String
     */
    public Future<String> getBrokerName() {
        return _module.call(String.class, "getBrokerName");
    }


    /**
     * Gets the method usage string. This summarises how to use the method.
     * 
     * @param name The name of the method. - String
     * @return A string that summarises the usage of the method. - String
     */
    public Future<String> getUsage(String name) {
        return _module.call(String.class, "getUsage", name);
    }


    /**
     * Performs the text-to-speech operations : it takes a std::string as input and outputs a sound in both speakers. String encoding must be UTF8.
     * 
     * @param stringToSay Text to say, encoded in UTF-8. - String
     * @return  - Void
     */
    public Future<Void> say(String stringToSay) {
        return _module.call(Void.class, "say", stringToSay);
    }


    /**
     * Performs the text-to-speech operations : it takes a std::string as input and outputs a sound in both speakers. String encoding must be UTF8.
     * 
     * @param stringToSay Text to say, encoded in UTF-8. - String
     * @param  p2 (None) - String
     * @return  - Void
     */
    public Future<Void> say(String stringToSay, String  p2) {
        return _module.call(Void.class, "say", stringToSay,  p2);
    }


    /**
     * Performs the text-to-speech operations: it takes a std::string as input and outputs the corresponding audio signal in the specified file.
     * 
     * @param pStringToSay Text to say, encoded in UTF-8. - String
     * @param pFileName RAW file where to store the generated signal. The signal is encoded with a sample rate of 22050Hz, format S16_LE, 2 channels. - String
     * @return Id of the task. Can be used to interrupt it. - Void
     */
    public Future<Void> sayToFile(String pStringToSay, String pFileName) {
        return _module.call(Void.class, "sayToFile", pStringToSay, pFileName);
    }


    /**
     * This method stops the current and all the pending tasks immediately.
     * 
     * @return  - Void
     */
    public Future<Void> stopAll() {
        return _module.call(Void.class, "stopAll");
    }


    /**
     * Changes the language used by the Text-to-Speech engine. It automatically changes the voice used since each of them is related to a unique language. If you want that change to take effect automatically after reboot of your robot, refer to the robot web page (setting page).
     * 
     * @param pLanguage Language name. Must belong to the languages available in TTS (can be obtained with the getAvailableLanguages method).  It should be an identifier std::string. - String
     * @return  - Void
     */
    public Future<Void> setLanguage(String pLanguage) {
        return _module.call(Void.class, "setLanguage", pLanguage);
    }


    /**
     * Returns the language currently used by the text-to-speech engine.
     * 
     * @return Language of the current voice. - String
     */
    public Future<String> getLanguage() {
        return _module.call(String.class, "getLanguage");
    }


    /**
     * Outputs the languages installed on the system.
     * 
     * @return Array of std::string that contains the languages installed on the system. - List<String>
     */
    public Future<java.util.List> getAvailableLanguages() {
        return _module.call(java.util.List.class, "getAvailableLanguages");
    }


    /**
     * Outputs all the languages supported (may be installed or not).
     * 
     * @return Array of std::string that contains all the supported languages (may be installed or not). - List<String>
     */
    public Future<java.util.List> getSupportedLanguages() {
        return _module.call(java.util.List.class, "getSupportedLanguages");
    }


    /**
     * Changes the parameters of the voice. For now, it is only possible to reset the voice speed.
     * 
     * @return (int) >= 0 if successful, negative error code if failed Vincent : pas sûr que cette fonction balance un truc en sortie - Void
     */
    public Future<Void> resetSpeed() {
        return _module.call(Void.class, "resetSpeed");
    }


    /**
     * Changes the parameters of the voice. The available parameters are: 
 	 pitchShift: applies a pitch shifting to the voice. The value indicates the ratio between the new fundamental frequencies and the old ones (examples: 2.0: an octave above, 1.5: a quint above). Correct range is (1.0 -- 4), or 0 to disable effect.
 	 doubleVoice: adds a second voice to the first one. The value indicates the ratio between the second voice fundamental frequency and the first one. Correct range is (1.0 -- 4), or 0 to disable effect 
 	 doubleVoiceLevel: the corresponding value is the level of the double voice (1.0: equal to the main voice one). Correct range is (0 -- 4). 
 	 doubleVoiceTimeShift: the corresponding value is the delay between the double voice and the main one. Correct range is (0 -- 0.5) 
 If the effect value is not available, the effect parameter remains unchanged.
     * 
     * @param pEffectName Name of the parameter. - String
     * @param pEffectValue Value of the parameter. - Float
     * @return (int) >= 0 if successful, negative error code if failed Vincent : pas sûr que cette fonction balance un truc en sortie - Void
     */
    public Future<Void> setParameter(String pEffectName, float pEffectValue) {
        return _module.call(Void.class, "setParameter", pEffectName, pEffectValue);
    }


    /**
     * Returns the value of one of the voice parameters. The available parameters are: "pitchShift", "doubleVoice","doubleVoiceLevel" and "doubleVoiceTimeShift"
     * 
     * @param pParameterName Name of the parameter. - String
     * @return Value of the specified parameter - Float
     */
    public Future<Float> getParameter(String pParameterName) {
        return _module.call(Float.class, "getParameter", pParameterName);
    }


    /**
     * Changes the voice used by the text-to-speech engine. The voice identifier must belong to the installed voices, that can be listed using the 'getAvailableVoices' method. If the voice is not available, it remains unchanged. No exception is thrown in this case. For the time being, only two voices are available by default : Kenny22Enhanced (English voice) and Julie22Enhanced (French voice)
     * 
     * @param pVoiceID The voice (as a std::string). - String
     * @return  - Void
     */
    public Future<Void> setVoice(String pVoiceID) {
        return _module.call(Void.class, "setVoice", pVoiceID);
    }


    /**
     * Returns the voice currently used by the text-to-speech engine.
     * 
     * @return Name of the current voice - String
     */
    public Future<String> getVoice() {
        return _module.call(String.class, "getVoice");
    }


    /**
     * Outputs the available voices. The returned list contains the voice IDs.
     * 
     * @return  Array of std::string containing the voices installed on the system. - List<String>
     */
    public Future<java.util.List> getAvailableVoices() {
        return _module.call(java.util.List.class, "getAvailableVoices");
    }


    /**
     * Sets the volume of text-to-speech output.
     * 
     * @param volume Volume (between 0.0 and 1.0). - Float
     * @return  - Void
     */
    public Future<Void> setVolume(float volume) {
        return _module.call(Void.class, "setVolume", volume);
    }


    /**
     * Fetches the current volume the text to speech.
     * 
     * @return Volume (integer between 0 and 100). - Float
     */
    public Future<Float> getVolume() {
        return _module.call(Float.class, "getVolume");
    }


    /**
     * Get the locale associate to the current language.
     * 
     * @return A string with xx_XX format (region_country) - String
     */
    public Future<String> locale() {
        return _module.call(String.class, "locale");
    }


    /**
     * Loads a set of voice parameters defined in a xml file contained in the preferences folder.The name of the xml file must begin with ALTextToSpeech_Voice_ 
     * 
     * @param pPreferenceName Name of the voice preference. - String
     * @return  - Void
     */
    public Future<Void> loadVoicePreference(String pPreferenceName) {
        return _module.call(Void.class, "loadVoicePreference", pPreferenceName);
    }


    /**
     * Sets a voice as the default voice for the corresponding language
     * 
     * @param Language The language among those available on your robot as a String - String
     * @param Voice The voice among those available on your robot as a String - String
     * @return  - Void
     */
    public Future<Void> setLanguageDefaultVoice(String Language, String Voice) {
        return _module.call(Void.class, "setLanguageDefaultVoice", Language, Voice);
    }


    /**
     * Shows the Dictionary.
     * 
     * @return  - Void
     */
    public Future<Void> showDictionary() {
        return _module.call(Void.class, "showDictionary");
    }


    /**
     * Reset ALTextToSpeech to his default state.
     * 
     * @return  - Void
     */
    public Future<Void> reset() {
        return _module.call(Void.class, "reset");
    }


    /**
     * Unload the dictionary.
     * 
     * @param word the word you wish to delete, does not have to be in japanese. - String
     * @param  p2 (None) - String
     * @return bool: true if succeeded, false if failed - Bool
     */
    public Future<Boolean> deleteFromDictionary(String word, String  p2) {
        return _module.call(Boolean.class, "deleteFromDictionary", word,  p2);
    }


    /**
     * Unload the dictionary.
     * 
     * @param word the word you wish to delete, does not have to be in japanese. - String
     * @return bool: true if succeeded, false if failed - Bool
     */
    public Future<Boolean> deleteFromDictionary(String word) {
        return _module.call(Boolean.class, "deleteFromDictionary", word);
    }


    /**
     * Add a word to the library
     * 
     * @param type the type of word you wish to insert, does not have to be in japanese. - String
     * @param word the word you wish to insert, does not have to be in japanese. - String
     * @param priority the priority of the word. - String
     * @param phonetic the phonetic pronouciation in KATAKANA. - String
     * @param accent syllabus and accentuation - String
     * @return bool: true if succeeded, false if failed - Bool
     */
    public Future<Boolean> addToDictionary(String type, String word, String priority, String phonetic, String accent) {
        return _module.call(Boolean.class, "addToDictionary", type, word, priority, phonetic, accent);
    }


    /**
     * Add a word to the library
     * 
     * @param type the type of word you wish to insert, does not have to be in japanese. - String
     * @param word the word you wish to insert, does not have to be in japanese. - String
     * @return bool: true if succeeded, false if failed - Bool
     */
    public Future<Boolean> addToDictionary(String type, String word) {
        return _module.call(Boolean.class, "addToDictionary", type, word);
    }


    /**
     * Signal: synchroTTS
     * Arguments: long
     */
    public QiSignalConnection synchroTTS(QiSignalListener listener) {
        return _module.connect("synchroTTS", listener);
    }


    /**
     * Signal: languageTTS
     * Arguments: java.lang.String
     */
    public QiSignalConnection languageTTS(QiSignalListener listener) {
        return _module.connect("languageTTS", listener);
    }
}

