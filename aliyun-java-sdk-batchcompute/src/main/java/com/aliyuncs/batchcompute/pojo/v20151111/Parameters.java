package com.aliyuncs.batchcompute.pojo.v20151111;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Created by guangchun.luo on 15/12/5.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Parameters {

    @JsonProperty("Command")
    private Command command;


    @JsonProperty("InputMappingConfig")
    private InputMappingConfig inputMappingConfig;


    @JsonProperty("StdoutRedirectPath")
    private String stdoutRedirectPath;

    @JsonProperty("StderrRedirectPath")
    private String stderrRedirectPath;




    @JsonIgnore
    public Command getCommand() {
        return command;
    }

    @JsonIgnore
    public void setCommand(Command command) {
        this.command = command;
    }

    @JsonIgnore
    public InputMappingConfig getInputMappingConfig() {
        return inputMappingConfig;
    }

    @JsonIgnore
    public void setInputMappingConfig(InputMappingConfig inputMappingConfig) {
        this.inputMappingConfig = inputMappingConfig;
    }

    @JsonIgnore
    public String getStdoutRedirectPath() {
        return stdoutRedirectPath;
    }

    @JsonIgnore
    public void setStdoutRedirectPath(String stdoutRedirectPath) {
        this.stdoutRedirectPath = stdoutRedirectPath;
    }

    @JsonIgnore
    public String getStderrRedirectPath() {
        return stderrRedirectPath;
    }

    @JsonIgnore
    public void setStderrRedirectPath(String stderrRedirectPath) {
        this.stderrRedirectPath = stderrRedirectPath;
    }

}
