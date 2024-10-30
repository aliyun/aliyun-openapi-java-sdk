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

package com.aliyuncs.csas.model.v20230120;

import com.aliyuncs.RpcAcsRequest;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateWmExtractTaskRequest extends RpcAcsRequest<CreateWmExtractTaskResponse> {
	   

	private Boolean videoIsLong;

	private Boolean documentIsCapture;

	private String videoSpeed;

	private String wmType;

	@SerializedName("csvControl")
	private CsvControl csvControl;

	private String filename;

	private Long wmInfoSize;

	private String fileUrl;
	public CreateWmExtractTaskRequest() {
		super("csas", "2023-01-20", "CreateWmExtractTask");
		setMethod(MethodType.POST);
	}

	public Boolean getVideoIsLong() {
		return this.videoIsLong;
	}

	public void setVideoIsLong(Boolean videoIsLong) {
		this.videoIsLong = videoIsLong;
		if(videoIsLong != null){
			putBodyParameter("VideoIsLong", videoIsLong.toString());
		}
	}

	public Boolean getDocumentIsCapture() {
		return this.documentIsCapture;
	}

	public void setDocumentIsCapture(Boolean documentIsCapture) {
		this.documentIsCapture = documentIsCapture;
		if(documentIsCapture != null){
			putBodyParameter("DocumentIsCapture", documentIsCapture.toString());
		}
	}

	public String getVideoSpeed() {
		return this.videoSpeed;
	}

	public void setVideoSpeed(String videoSpeed) {
		this.videoSpeed = videoSpeed;
		if(videoSpeed != null){
			putBodyParameter("VideoSpeed", videoSpeed);
		}
	}

	public String getWmType() {
		return this.wmType;
	}

	public void setWmType(String wmType) {
		this.wmType = wmType;
		if(wmType != null){
			putBodyParameter("WmType", wmType);
		}
	}

	public CsvControl getCsvControl() {
		return this.csvControl;
	}

	public void setCsvControl(CsvControl csvControl) {
		this.csvControl = csvControl;	
		if (csvControl != null) {
			putQueryParameter("CsvControl" , new Gson().toJson(csvControl));
		}	
	}

	public String getFilename() {
		return this.filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
		if(filename != null){
			putBodyParameter("Filename", filename);
		}
	}

	public Long getWmInfoSize() {
		return this.wmInfoSize;
	}

	public void setWmInfoSize(Long wmInfoSize) {
		this.wmInfoSize = wmInfoSize;
		if(wmInfoSize != null){
			putBodyParameter("WmInfoSize", wmInfoSize.toString());
		}
	}

	public String getFileUrl() {
		return this.fileUrl;
	}

	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
		if(fileUrl != null){
			putBodyParameter("FileUrl", fileUrl);
		}
	}

	public static class CsvControl {

		@SerializedName("Method")
		private String method;

		@SerializedName("EmbedColumn")
		private Long embedColumn;

		@SerializedName("EmbedPrecision")
		private Long embedPrecision;

		public String getBizMethod() {
			return this.method;
		}

		public void setBizMethod(String method) {
			this.method = method;
		}

		public Long getEmbedColumn() {
			return this.embedColumn;
		}

		public void setEmbedColumn(Long embedColumn) {
			this.embedColumn = embedColumn;
		}

		public Long getEmbedPrecision() {
			return this.embedPrecision;
		}

		public void setEmbedPrecision(Long embedPrecision) {
			this.embedPrecision = embedPrecision;
		}
	}

	@Override
	public Class<CreateWmExtractTaskResponse> getResponseClass() {
		return CreateWmExtractTaskResponse.class;
	}

}
