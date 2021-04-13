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

package com.aliyuncs.videoenhan.model.v20200320;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.videoenhan.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GenerateVideoRequest extends RpcAcsRequest<GenerateVideoResponse> {
	   

	private String transitionStyle;

	private String scene;

	private Float duration;

	private Boolean puzzleEffect;

	private Integer height;

	private Boolean durationAdaption;

	private List<FileList> fileLists;

	private Boolean mute;

	private Boolean smartEffect;

	private Integer width;

	private String style;
	public GenerateVideoRequest() {
		super("videoenhan", "2020-03-20", "GenerateVideo", "videoenhan");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTransitionStyle() {
		return this.transitionStyle;
	}

	public void setTransitionStyle(String transitionStyle) {
		this.transitionStyle = transitionStyle;
		if(transitionStyle != null){
			putBodyParameter("TransitionStyle", transitionStyle);
		}
	}

	public String getScene() {
		return this.scene;
	}

	public void setScene(String scene) {
		this.scene = scene;
		if(scene != null){
			putBodyParameter("Scene", scene);
		}
	}

	public Float getDuration() {
		return this.duration;
	}

	public void setDuration(Float duration) {
		this.duration = duration;
		if(duration != null){
			putBodyParameter("Duration", duration.toString());
		}
	}

	public Boolean getPuzzleEffect() {
		return this.puzzleEffect;
	}

	public void setPuzzleEffect(Boolean puzzleEffect) {
		this.puzzleEffect = puzzleEffect;
		if(puzzleEffect != null){
			putBodyParameter("PuzzleEffect", puzzleEffect.toString());
		}
	}

	public Integer getHeight() {
		return this.height;
	}

	public void setHeight(Integer height) {
		this.height = height;
		if(height != null){
			putBodyParameter("Height", height.toString());
		}
	}

	public Boolean getDurationAdaption() {
		return this.durationAdaption;
	}

	public void setDurationAdaption(Boolean durationAdaption) {
		this.durationAdaption = durationAdaption;
		if(durationAdaption != null){
			putBodyParameter("DurationAdaption", durationAdaption.toString());
		}
	}

	public List<FileList> getFileLists() {
		return this.fileLists;
	}

	public void setFileLists(List<FileList> fileLists) {
		this.fileLists = fileLists;	
		if (fileLists != null) {
			for (int depth1 = 0; depth1 < fileLists.size(); depth1++) {
				putBodyParameter("FileList." + (depth1 + 1) + ".FileName" , fileLists.get(depth1).getFileName());
				putBodyParameter("FileList." + (depth1 + 1) + ".FileUrl" , fileLists.get(depth1).getFileUrl());
				putBodyParameter("FileList." + (depth1 + 1) + ".Type" , fileLists.get(depth1).getType());
			}
		}	
	}

	public Boolean getMute() {
		return this.mute;
	}

	public void setMute(Boolean mute) {
		this.mute = mute;
		if(mute != null){
			putBodyParameter("Mute", mute.toString());
		}
	}

	public Boolean getSmartEffect() {
		return this.smartEffect;
	}

	public void setSmartEffect(Boolean smartEffect) {
		this.smartEffect = smartEffect;
		if(smartEffect != null){
			putBodyParameter("SmartEffect", smartEffect.toString());
		}
	}

	public Integer getWidth() {
		return this.width;
	}

	public void setWidth(Integer width) {
		this.width = width;
		if(width != null){
			putBodyParameter("Width", width.toString());
		}
	}

	public String getStyle() {
		return this.style;
	}

	public void setStyle(String style) {
		this.style = style;
		if(style != null){
			putBodyParameter("Style", style);
		}
	}

	public static class FileList {

		private String fileName;

		private String fileUrl;

		private String type;

		public String getFileName() {
			return this.fileName;
		}

		public void setFileName(String fileName) {
			this.fileName = fileName;
		}

		public String getFileUrl() {
			return this.fileUrl;
		}

		public void setFileUrl(String fileUrl) {
			this.fileUrl = fileUrl;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}
	}

	@Override
	public Class<GenerateVideoResponse> getResponseClass() {
		return GenerateVideoResponse.class;
	}

}
