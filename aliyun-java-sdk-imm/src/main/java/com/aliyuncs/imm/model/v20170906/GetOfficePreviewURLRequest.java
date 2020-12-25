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

package com.aliyuncs.imm.model.v20170906;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.imm.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetOfficePreviewURLRequest extends RpcAcsRequest<GetOfficePreviewURLResponse> {
	   

	private String srcType;

	private String project;

	private Integer watermarkVertical;

	private Integer watermarkType;

	private Float watermarkRotate;

	private String watermarkValue;

	private String watermarkFont;

	private Integer watermarkHorizontal;

	private String srcUri;

	private String watermarkFillStyle;
	public GetOfficePreviewURLRequest() {
		super("imm", "2017-09-06", "GetOfficePreviewURL");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSrcType() {
		return this.srcType;
	}

	public void setSrcType(String srcType) {
		this.srcType = srcType;
		if(srcType != null){
			putQueryParameter("SrcType", srcType);
		}
	}

	public String getProject() {
		return this.project;
	}

	public void setProject(String project) {
		this.project = project;
		if(project != null){
			putQueryParameter("Project", project);
		}
	}

	public Integer getWatermarkVertical() {
		return this.watermarkVertical;
	}

	public void setWatermarkVertical(Integer watermarkVertical) {
		this.watermarkVertical = watermarkVertical;
		if(watermarkVertical != null){
			putQueryParameter("WatermarkVertical", watermarkVertical.toString());
		}
	}

	public Integer getWatermarkType() {
		return this.watermarkType;
	}

	public void setWatermarkType(Integer watermarkType) {
		this.watermarkType = watermarkType;
		if(watermarkType != null){
			putQueryParameter("WatermarkType", watermarkType.toString());
		}
	}

	public Float getWatermarkRotate() {
		return this.watermarkRotate;
	}

	public void setWatermarkRotate(Float watermarkRotate) {
		this.watermarkRotate = watermarkRotate;
		if(watermarkRotate != null){
			putQueryParameter("WatermarkRotate", watermarkRotate.toString());
		}
	}

	public String getWatermarkValue() {
		return this.watermarkValue;
	}

	public void setWatermarkValue(String watermarkValue) {
		this.watermarkValue = watermarkValue;
		if(watermarkValue != null){
			putQueryParameter("WatermarkValue", watermarkValue);
		}
	}

	public String getWatermarkFont() {
		return this.watermarkFont;
	}

	public void setWatermarkFont(String watermarkFont) {
		this.watermarkFont = watermarkFont;
		if(watermarkFont != null){
			putQueryParameter("WatermarkFont", watermarkFont);
		}
	}

	public Integer getWatermarkHorizontal() {
		return this.watermarkHorizontal;
	}

	public void setWatermarkHorizontal(Integer watermarkHorizontal) {
		this.watermarkHorizontal = watermarkHorizontal;
		if(watermarkHorizontal != null){
			putQueryParameter("WatermarkHorizontal", watermarkHorizontal.toString());
		}
	}

	public String getSrcUri() {
		return this.srcUri;
	}

	public void setSrcUri(String srcUri) {
		this.srcUri = srcUri;
		if(srcUri != null){
			putQueryParameter("SrcUri", srcUri);
		}
	}

	public String getWatermarkFillStyle() {
		return this.watermarkFillStyle;
	}

	public void setWatermarkFillStyle(String watermarkFillStyle) {
		this.watermarkFillStyle = watermarkFillStyle;
		if(watermarkFillStyle != null){
			putQueryParameter("WatermarkFillStyle", watermarkFillStyle);
		}
	}

	@Override
	public Class<GetOfficePreviewURLResponse> getResponseClass() {
		return GetOfficePreviewURLResponse.class;
	}

}
