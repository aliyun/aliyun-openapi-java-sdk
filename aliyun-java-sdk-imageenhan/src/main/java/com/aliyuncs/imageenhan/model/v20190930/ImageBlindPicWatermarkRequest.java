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

package com.aliyuncs.imageenhan.model.v20190930;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.imageenhan.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ImageBlindPicWatermarkRequest extends RpcAcsRequest<ImageBlindPicWatermarkResponse> {
	   

	private String watermarkImageURL;

	private Integer qualityFactor;

	private String functionType;

	private String logoURL;

	private String outputFileType;

	private String originImageURL;
	public ImageBlindPicWatermarkRequest() {
		super("imageenhan", "2019-09-30", "ImageBlindPicWatermark", "imageenhan");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getWatermarkImageURL() {
		return this.watermarkImageURL;
	}

	public void setWatermarkImageURL(String watermarkImageURL) {
		this.watermarkImageURL = watermarkImageURL;
		if(watermarkImageURL != null){
			putBodyParameter("WatermarkImageURL", watermarkImageURL);
		}
	}

	public Integer getQualityFactor() {
		return this.qualityFactor;
	}

	public void setQualityFactor(Integer qualityFactor) {
		this.qualityFactor = qualityFactor;
		if(qualityFactor != null){
			putBodyParameter("QualityFactor", qualityFactor.toString());
		}
	}

	public String getFunctionType() {
		return this.functionType;
	}

	public void setFunctionType(String functionType) {
		this.functionType = functionType;
		if(functionType != null){
			putBodyParameter("FunctionType", functionType);
		}
	}

	public String getLogoURL() {
		return this.logoURL;
	}

	public void setLogoURL(String logoURL) {
		this.logoURL = logoURL;
		if(logoURL != null){
			putBodyParameter("LogoURL", logoURL);
		}
	}

	public String getOutputFileType() {
		return this.outputFileType;
	}

	public void setOutputFileType(String outputFileType) {
		this.outputFileType = outputFileType;
		if(outputFileType != null){
			putBodyParameter("OutputFileType", outputFileType);
		}
	}

	public String getOriginImageURL() {
		return this.originImageURL;
	}

	public void setOriginImageURL(String originImageURL) {
		this.originImageURL = originImageURL;
		if(originImageURL != null){
			putBodyParameter("OriginImageURL", originImageURL);
		}
	}

	@Override
	public Class<ImageBlindPicWatermarkResponse> getResponseClass() {
		return ImageBlindPicWatermarkResponse.class;
	}

}
