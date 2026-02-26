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
public class TermEditRequest extends RoaAcsRequest<TermEditResponse> {
	   

	@SerializedName("ext")
	private Ext ext;

	private String sourceLanguage;

	private String scene;

	private String targetLanguage;

	private String workspaceId;
	public TermEditRequest() {
		super("AnyTrans", "2025-07-07", "TermEdit");
		setProtocol(ProtocolType.HTTPS);
		setUriPattern("/anytrans/translate/intervene/edit");
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

		@SerializedName("terms")
		private List<TermsItem> terms;

		public List<TermsItem> getTerms() {
			return this.terms;
		}

		public void setTerms(List<TermsItem> terms) {
			this.terms = terms;
		}

		public static class TermsItem {

			@SerializedName("tgt")
			private String tgt;

			@SerializedName("termId")
			private String termId;

			@SerializedName("src")
			private String src;

			public String getTgt() {
				return this.tgt;
			}

			public void setTgt(String tgt) {
				this.tgt = tgt;
			}

			public String getTermId() {
				return this.termId;
			}

			public void setTermId(String termId) {
				this.termId = termId;
			}

			public String getSrc() {
				return this.src;
			}

			public void setSrc(String src) {
				this.src = src;
			}
		}
	}

	@Override
	public Class<TermEditResponse> getResponseClass() {
		return TermEditResponse.class;
	}

}
