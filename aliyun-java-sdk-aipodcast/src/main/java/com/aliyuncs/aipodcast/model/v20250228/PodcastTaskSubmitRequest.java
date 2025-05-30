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

package com.aliyuncs.aipodcast.model.v20250228;

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
public class PodcastTaskSubmitRequest extends RoaAcsRequest<PodcastTaskSubmitResponse> {
	   

	private String sourceLang;

	private Integer counts;

	@SerializedName("fileUrls")
	private List<String> fileUrls;

	private String text;

	@SerializedName("voices")
	private List<String> voices;

	private String topic;

	private String workspaceId;
	public PodcastTaskSubmitRequest() {
		super("AIPodcast", "2025-02-28", "PodcastTaskSubmit");
		setProtocol(ProtocolType.HTTPS);
		setUriPattern("/podcast/task/submit");
		setMethod(MethodType.POST);
	}

	public String getSourceLang() {
		return this.sourceLang;
	}

	public void setSourceLang(String sourceLang) {
		this.sourceLang = sourceLang;
		if(sourceLang != null){
			putBodyParameter("sourceLang", sourceLang);
		}
	}

	public Integer getCounts() {
		return this.counts;
	}

	public void setCounts(Integer counts) {
		this.counts = counts;
		if(counts != null){
			putBodyParameter("counts", counts.toString());
		}
	}

	public List<String> getFileUrls() {
		return this.fileUrls;
	}

	public void setFileUrls(List<String> fileUrls) {
		this.fileUrls = fileUrls;	
		if (fileUrls != null) {
			putBodyParameter("fileUrls" , new Gson().toJson(fileUrls));
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

	public List<String> getVoices() {
		return this.voices;
	}

	public void setVoices(List<String> voices) {
		this.voices = voices;	
		if (voices != null) {
			putBodyParameter("voices" , new Gson().toJson(voices));
		}	
	}

	public String getTopic() {
		return this.topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
		if(topic != null){
			putBodyParameter("topic", topic);
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

	@Override
	public Class<PodcastTaskSubmitResponse> getResponseClass() {
		return PodcastTaskSubmitResponse.class;
	}

}
