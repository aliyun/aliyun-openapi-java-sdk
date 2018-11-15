/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.chatbot.model.v20171011;

import com.alibaba.fastjson.JSON;
import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

import java.util.List;

/**
 * @author auto create
 */
public class UpdateDialogFlowRequest extends RpcAcsRequest<UpdateDialogFlowResponse> {

    public UpdateDialogFlowRequest() {

        super("Chatbot", "2017-10-11", "UpdateDialogFlow", "beebot");
        setMethod(MethodType.POST);
    }

    private PaasModuleDTO moduleDefinition;

    public PaasModuleDTO getModuleDefinition() {
        return moduleDefinition;
    }

    public void setModuleDefinition(PaasModuleDTO moduleDefinition) {
        this.moduleDefinition = moduleDefinition;
        String moduleDefinitionStr = JSON.toJSONString(moduleDefinition);
        if (moduleDefinition != null) {
            putBodyParameter("ModuleDefinition", moduleDefinitionStr);
        }
    }

    private Long dialogId;

    public Long getDialogId() {
        return this.dialogId;
    }

    public void setDialogId(Long dialogId) {
        this.dialogId = dialogId;
        if (dialogId != null) {
            putQueryParameter("DialogId", dialogId.toString());
        }
    }

    public static class PaasModuleDTO {
        private ModuleDefinition moduleDefinition;

        public void setModuleDefinition(ModuleDefinition moduleDefinition) {
            this.moduleDefinition = moduleDefinition;
        }

        public ModuleDefinition getModuleDefinition() {
            return moduleDefinition;
        }
    }

    public static class ModuleDefinition {
        private List<NodesItem> nodes;

        private List<EdgesItem> edges;

        public List<NodesItem> getNodes() {
            return this.nodes;
        }

        public void setNodes(List<NodesItem> nodes) {
            this.nodes = nodes;
        }

        public List<EdgesItem> getEdges() {
            return this.edges;
        }

        public void setEdges(List<EdgesItem> edges) {
            this.edges = edges;
        }
    }

    public static class EdgesItem {

        private String id;

        private String label;

        private String source;

        private String target;

        public String getId() {
            return this.id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getLabel() {
            return this.label;
        }

        public void setLabel(String label) {
            this.label = label;
        }

        public String getSource() {
            return this.source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public String getTarget() {
            return this.target;
        }

        public void setTarget(String target) {
            this.target = target;
        }
    }

    public static class NodesItem {

        private String code;

        private String componentCode;

        private Boolean pluginDataUpdate;

        private String xx;

        private String yy;

        private String id;

        private String label;

        private PluginData pluginData;

        public String getCode() {
            return this.code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getComponentCode() {
            return this.componentCode;
        }

        public void setComponentCode(String componentCode) {
            this.componentCode = componentCode;
        }

        public Boolean getPluginDataUpdate() {
            return this.pluginDataUpdate;
        }

        public void setPluginDataUpdate(Boolean pluginDataUpdate) {
            this.pluginDataUpdate = pluginDataUpdate;
        }

        public String getXx() {
            return this.xx;
        }

        public void setXx(String xx) {
            this.xx = xx;
        }

        public String getYy() {
            return this.yy;
        }

        public void setYy(String yy) {
            this.yy = yy;
        }

        public String getId() {
            return this.id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getLabel() {
            return this.label;
        }

        public void setLabel(String label) {
            this.label = label;
        }

        public PluginData getPluginData() {
            return this.pluginData;
        }

        public void setPluginData(PluginData pluginData) {
            this.pluginData = pluginData;
        }

    }

    public static class PluginData {

        private Entry entry;

        private Function function;

        private Response response;

        private Slot slot;

        public Entry getEntry() {
            return this.entry;
        }

        public void setEntry(Entry entry) {
            this.entry = entry;
        }

        public Function getFunction() {
            return this.function;
        }

        public void setFunction(
            Function function) {
            this.function = function;
        }

        public Response getResponse() {
            return this.response;
        }

        public void setResponse(
            Response response) {
            this.response = response;
        }

        public Slot getSlot() {
            return this.slot;
        }

        public void setSlot(Slot slot) {
            this.slot = slot;
        }

    }

    public static class Slot {

        private PluginFieldDataSlot
            pluginFieldDataSlot;

        public PluginFieldDataSlot getPluginFieldDataSlot() {
            return this.pluginFieldDataSlot;
        }

        public void setPluginFieldDataSlot(
            PluginFieldDataSlot pluginFieldDataSlot) {
            this.pluginFieldDataSlot = pluginFieldDataSlot;
        }
    }

    public static class PluginFieldDataSlot {

        private String intentId;

        private String intentName;

        private Boolean isSysIntent;

        private String name;

        private List<ContentSlotItem> contentSlot;

        public String getIntentId() {
            return this.intentId;
        }

        public void setIntentId(String intentId) {
            this.intentId = intentId;
        }

        public String getIntentName() {
            return this.intentName;
        }

        public void setIntentName(String intentName) {
            this.intentName = intentName;
        }

        public Boolean getIsSysIntent() {
            return this.isSysIntent;
        }

        public void setIsSysIntent(Boolean isSysIntent) {
            this.isSysIntent = isSysIntent;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<ContentSlotItem> getContentSlot() {
            return this.contentSlot;
        }

        public void setContentSlot(List<ContentSlotItem> contentSlot) {
            this.contentSlot = contentSlot;
        }
    }

    public static class ContentSlotItem {

        private Boolean isArray;

        private Boolean isNecessary;

        private Integer lifeSpan;

        private String name;

        private String value;

        private List<String> question;

        public Boolean getIsArray() {
            return this.isArray;
        }

        public void setIsArray(Boolean isArray) {
            this.isArray = isArray;
        }

        public Boolean getIsNecessary() {
            return this.isNecessary;
        }

        public void setIsNecessary(Boolean isNecessary) {
            this.isNecessary = isNecessary;
        }

        public Integer getLifeSpan() {
            return this.lifeSpan;
        }

        public void setLifeSpan(Integer lifeSpan) {
            this.lifeSpan = lifeSpan;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getValue() {
            return this.value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public List<String> getQuestion() {
            return this.question;
        }

        public void setQuestion(List<String> question) {
            this.question = question;
        }
    }

    public static class Response {

        private PluginFieldDataResponse
            pluginFieldDataResponse;

        public PluginFieldDataResponse getPluginFieldDataResponse() {
            return this.pluginFieldDataResponse;
        }

        public void setPluginFieldDataResponse(
            PluginFieldDataResponse pluginFieldDataResponse) {
            this.pluginFieldDataResponse = pluginFieldDataResponse;
        }
    }

    public static class PluginFieldDataResponse {

        private String name;

        private ContentResponse
            contentResponse;

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public ContentResponse getContentResponse() {
            return this.contentResponse;
        }

        public void setContentResponse(
            ContentResponse contentResponse) {
            this.contentResponse = contentResponse;
        }
    }

    public static class ContentResponse {

        private String text;

        private String type;

        private String image;

        private ButtonList
            buttonList;

        public String getText() {
            return this.text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getType() {
            return this.type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getImage() {
            return this.image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public ButtonList getButtonList() {
            return this.buttonList;
        }

        public void setButtonList(
            ButtonList buttonList) {
            this.buttonList = buttonList;
        }
    }

    public static class ButtonList {

        private String intro;

        private List<ButtonItem> button;

        public String getIntro() {
            return this.intro;
        }

        public void setIntro(String intro) {
            this.intro = intro;
        }

        public List<ButtonItem> getButton() {
            return this.button;
        }

        public void setButton(List<ButtonItem> button) {
            this.button = button;
        }
    }

    public static class ButtonItem {

        private String name;

        private String type;

        private String text;

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getType() {
            return this.type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getText() {
            return this.text;
        }

        public void setText(String text) {
            this.text = text;
        }
    }

    public static class Function {

        private PluginFieldDataFunction
            pluginFieldDataFunction;

        public PluginFieldDataFunction getPluginFieldDataFunction() {
            return this.pluginFieldDataFunction;
        }

        public void setPluginFieldDataFunction(
            PluginFieldDataFunction pluginFieldDataFunction) {
            this.pluginFieldDataFunction = pluginFieldDataFunction;
        }
    }

    public static class PluginFieldDataFunction {

        private String code;

        private String description;

        private String function;

        private String name;

        private String aliyunService;

        private String aliyunFunction;

        private String endPoint;

        private String type;

        private List<SwitchItem> _switch;

        private List<String> params;

        public String getCode() {
            return this.code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getDescription() {
            return this.description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getFunction() {
            return this.function;
        }

        public void setFunction(String function) {
            this.function = function;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAliyunService() {
            return this.aliyunService;
        }

        public void setAliyunService(String aliyunService) {
            this.aliyunService = aliyunService;
        }

        public String getAliyunFunction() {
            return this.aliyunFunction;
        }

        public void setAliyunFunction(String aliyunFunction) {
            this.aliyunFunction = aliyunFunction;
        }

        public String getEndPoint() {
            return this.endPoint;
        }

        public void setEndPoint(String endPoint) {
            this.endPoint = endPoint;
        }

        public String getType() {
            return this.type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public List<SwitchItem> get_Switch() {
            return this._switch;
        }

        public void set_Switch(List<SwitchItem> _switch) {
            this._switch = _switch;
        }

        public List<String> getParams() {
            return this.params;
        }

        public void setParams(List<String> params) {
            this.params = params;
        }
    }

    public static class SwitchItem {

        private String id;

        private String label;

        private String type;

        private String value;

        private String name;

        public String getId() {
            return this.id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getLabel() {
            return this.label;
        }

        public void setLabel(String label) {
            this.label = label;
        }

        public String getType() {
            return this.type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getValue() {
            return this.value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class Entry {

        private PluginFieldDataEntry
            pluginFieldDataEntry;

        public PluginFieldDataEntry getPluginFieldDataEntry() {
            return this.pluginFieldDataEntry;
        }

        public void setPluginFieldDataEntry(
            PluginFieldDataEntry pluginFieldDataEntry) {
            this.pluginFieldDataEntry = pluginFieldDataEntry;
        }
    }

    public static class ConditionEntriesItem {

        private String id;

        private String term;

        private String name;

        private String type;

        private String value;

        public String getId() {
            return this.id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getTerm() {
            return this.term;
        }

        public void setTerm(String term) {
            this.term = term;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getType() {
            return this.type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getValue() {
            return this.value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    public static class ContentEntryItem {

        private List<ConditionEntriesItem> conditionEntries;

        public List<ConditionEntriesItem> getConditionEntries() {
            return this.conditionEntries;
        }

        public void setConditionEntries(List<ConditionEntriesItem> conditionEntries) {
            this.conditionEntries = conditionEntries;
        }
    }

    public static class PluginFieldDataEntry {

        private Integer lifeSpan;

        private String name;

        private List<ContentEntryItem> contentEntry;

        public Integer getLifeSpan() {
            return this.lifeSpan;
        }

        public void setLifeSpan(Integer lifeSpan) {
            this.lifeSpan = lifeSpan;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<ContentEntryItem> getContentEntry() {
            return this.contentEntry;
        }

        public void setContentEntry(List<ContentEntryItem> contentEntry) {
            this.contentEntry = contentEntry;
        }
    }

    @Override
    public Class<UpdateDialogFlowResponse> getResponseClass() {
        return UpdateDialogFlowResponse.class;
    }

}
