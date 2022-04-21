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

package com.aliyuncs.voicenavigator.model.v20180612;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.voicenavigator.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyAsrConfigRequest extends RpcAcsRequest<ModifyAsrConfigResponse> {
	   

	private String asrVocabularyId;

	private String asrClassVocabularyId;

	private String entryId;

	private String asrCustomizationId;

	private Integer configLevel;

	private String asrAcousticModelId;
	public ModifyAsrConfigRequest() {
		super("VoiceNavigator", "2018-06-12", "ModifyAsrConfig", "voicebot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAsrVocabularyId() {
		return this.asrVocabularyId;
	}

	public void setAsrVocabularyId(String asrVocabularyId) {
		this.asrVocabularyId = asrVocabularyId;
		if(asrVocabularyId != null){
			putQueryParameter("AsrVocabularyId", asrVocabularyId);
		}
	}

	public String getAsrClassVocabularyId() {
		return this.asrClassVocabularyId;
	}

	public void setAsrClassVocabularyId(String asrClassVocabularyId) {
		this.asrClassVocabularyId = asrClassVocabularyId;
		if(asrClassVocabularyId != null){
			putQueryParameter("AsrClassVocabularyId", asrClassVocabularyId);
		}
	}

	public String getEntryId() {
		return this.entryId;
	}

	public void setEntryId(String entryId) {
		this.entryId = entryId;
		if(entryId != null){
			putQueryParameter("EntryId", entryId);
		}
	}

	public String getAsrCustomizationId() {
		return this.asrCustomizationId;
	}

	public void setAsrCustomizationId(String asrCustomizationId) {
		this.asrCustomizationId = asrCustomizationId;
		if(asrCustomizationId != null){
			putQueryParameter("AsrCustomizationId", asrCustomizationId);
		}
	}

	public Integer getConfigLevel() {
		return this.configLevel;
	}

	public void setConfigLevel(Integer configLevel) {
		this.configLevel = configLevel;
		if(configLevel != null){
			putQueryParameter("ConfigLevel", configLevel.toString());
		}
	}

	public String getAsrAcousticModelId() {
		return this.asrAcousticModelId;
	}

	public void setAsrAcousticModelId(String asrAcousticModelId) {
		this.asrAcousticModelId = asrAcousticModelId;
		if(asrAcousticModelId != null){
			putQueryParameter("AsrAcousticModelId", asrAcousticModelId);
		}
	}

	@Override
	public Class<ModifyAsrConfigResponse> getResponseClass() {
		return ModifyAsrConfigResponse.class;
	}

}
