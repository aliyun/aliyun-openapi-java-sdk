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

package com.aliyuncs.mopen.model.v20180211;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class MoPenDoRecognizeRequest extends RpcAcsRequest<MoPenDoRecognizeResponse> {
	
	public MoPenDoRecognizeRequest() {
		super("MoPen", "2018-02-11", "MoPenDoRecognize");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	private Long canvasId;

	private Integer endY;

	private Integer endX;

	private String jsonConf;

	private String exportType;

	private Integer startY;

	private Integer startX;

	public Long getCanvasId() {
		return this.canvasId;
	}

	public void setCanvasId(Long canvasId) {
		this.canvasId = canvasId;
		if(canvasId != null){
			putBodyParameter("CanvasId", canvasId.toString());
		}
	}

	public Integer getEndY() {
		return this.endY;
	}

	public void setEndY(Integer endY) {
		this.endY = endY;
		if(endY != null){
			putBodyParameter("EndY", endY.toString());
		}
	}

	public Integer getEndX() {
		return this.endX;
	}

	public void setEndX(Integer endX) {
		this.endX = endX;
		if(endX != null){
			putBodyParameter("EndX", endX.toString());
		}
	}

	public String getJsonConf() {
		return this.jsonConf;
	}

	public void setJsonConf(String jsonConf) {
		this.jsonConf = jsonConf;
		if(jsonConf != null){
			putBodyParameter("JsonConf", jsonConf);
		}
	}

	public String getExportType() {
		return this.exportType;
	}

	public void setExportType(String exportType) {
		this.exportType = exportType;
		if(exportType != null){
			putBodyParameter("ExportType", exportType);
		}
	}

	public Integer getStartY() {
		return this.startY;
	}

	public void setStartY(Integer startY) {
		this.startY = startY;
		if(startY != null){
			putBodyParameter("StartY", startY.toString());
		}
	}

	public Integer getStartX() {
		return this.startX;
	}

	public void setStartX(Integer startX) {
		this.startX = startX;
		if(startX != null){
			putBodyParameter("StartX", startX.toString());
		}
	}

	@Override
	public Class<MoPenDoRecognizeResponse> getResponseClass() {
		return MoPenDoRecognizeResponse.class;
	}

}
