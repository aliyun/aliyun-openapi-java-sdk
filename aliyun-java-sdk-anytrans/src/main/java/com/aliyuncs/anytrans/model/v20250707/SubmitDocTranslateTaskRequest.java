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

package com.aliyuncs.anytrans.model.v20250707;

import com.aliyuncs.RoaAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class SubmitDocTranslateTaskRequest extends RoaAcsRequest<SubmitDocTranslateTaskResponse> {
	   

	@SerializedName("ext")
	private Ext ext;

	private String sourceLanguage;

	private String format;

	private String scene;

	private String targetLanguage;

	private String text;

	private String workspaceId;
	public SubmitDocTranslateTaskRequest() {
		super("AnyTrans", "2025-07-07", "SubmitDocTranslateTask");
		setProtocol(ProtocolType.HTTPS);
		setUriPattern("/anytrans/translate/doc/submit");
		setMethod(MethodType.POST);
	}

	public Ext getExt() {
		return this.ext;
	}

	public void setExt(Ext ext) {
		this.ext = ext;	
		if (ext != null) {
			putBodyParameter("ext" , new Gson().toJson(ext));
		}	
	}

	public String getSourceLanguage() {
		return this.sourceLanguage;
	}

	public void setSourceLanguage(String sourceLanguage) {
		this.sourceLanguage = sourceLanguage;
		if(sourceLanguage != null){
			putBodyParameter("sourceLanguage", sourceLanguage);
		}
	}

	public String getFormat() {
		return this.format;
	}

	public void setFormat(String format) {
		this.format = format;
		if(format != null){
			putBodyParameter("format", format);
		}
	}

	public String getScene() {
		return this.scene;
	}

	public void setScene(String scene) {
		this.scene = scene;
		if(scene != null){
			putBodyParameter("scene", scene);
		}
	}

	public String getTargetLanguage() {
		return this.targetLanguage;
	}

	public void setTargetLanguage(String targetLanguage) {
		this.targetLanguage = targetLanguage;
		if(targetLanguage != null){
			putBodyParameter("targetLanguage", targetLanguage);
		}
	}

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
		if(text != null){
			putBodyParameter("text", text);
		}
	}

	public String getWorkspaceId() {
		return this.workspaceId;
	}

	public void setWorkspaceId(String workspaceId) {
		this.workspaceId = workspaceId;
		if(workspaceId != null){
			putBodyParameter("workspaceId", workspaceId);
		}
	}

	public static class Ext {

		@SerializedName("terminologies")
		private List<TerminologiesItem> terminologies;

		@SerializedName("config")
		private Config config;

		@SerializedName("domainHint")
		private String domainHint;

		public List<TerminologiesItem> getTerminologies() {
			return this.terminologies;
		}

		public void setTerminologies(List<TerminologiesItem> terminologies) {
			this.terminologies = terminologies;
		}

		public Config getConfig() {
			return this.config;
		}

		public void setConfig(Config config) {
			this.config = config;
		}

		public String getDomainHint() {
			return this.domainHint;
		}

		public void setDomainHint(String domainHint) {
			this.domainHint = domainHint;
		}

		public static class TerminologiesItem {

			@SerializedName("tgt")
			private String tgt;

			@SerializedName("src")
			private String src;

			public String getTgt() {
				return this.tgt;
			}

			public void setTgt(String tgt) {
				this.tgt = tgt;
			}

			public String getSrc() {
				return this.src;
			}

			public void setSrc(String src) {
				this.src = src;
			}
		}

		public static class Config {

			@SerializedName("skipImgTrans")
			private Boolean skipImgTrans;

			public Boolean getSkipImgTrans() {
				return this.skipImgTrans;
			}

			public void setSkipImgTrans(Boolean skipImgTrans) {
				this.skipImgTrans = skipImgTrans;
			}
		}
	}

	@Override
	public Class<SubmitDocTranslateTaskResponse> getResponseClass() {
		return SubmitDocTranslateTaskResponse.class;
	}

}
