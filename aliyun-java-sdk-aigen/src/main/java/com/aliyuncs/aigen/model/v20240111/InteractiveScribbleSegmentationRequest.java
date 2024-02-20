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

package com.aliyuncs.aigen.model.v20240111;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class InteractiveScribbleSegmentationRequest extends RpcAcsRequest<InteractiveScribbleSegmentationResponse> {
	   

	private String posScribbleImageUrl;

	private String integratedMaskUrl;

	private String maskImageUrl;

	private String returnForm;

	private String negScribbleImageUrl;

	private String returnFormat;

	private String edgeFeathering;

	private String imageUrl;

	private String postprocessOption;
	public InteractiveScribbleSegmentationRequest() {
		super("aigen", "2024-01-11", "InteractiveScribbleSegmentation");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getPosScribbleImageUrl() {
		return this.posScribbleImageUrl;
	}

	public void setPosScribbleImageUrl(String posScribbleImageUrl) {
		this.posScribbleImageUrl = posScribbleImageUrl;
		if(posScribbleImageUrl != null){
			putBodyParameter("PosScribbleImageUrl", posScribbleImageUrl);
		}
	}

	public String getIntegratedMaskUrl() {
		return this.integratedMaskUrl;
	}

	public void setIntegratedMaskUrl(String integratedMaskUrl) {
		this.integratedMaskUrl = integratedMaskUrl;
		if(integratedMaskUrl != null){
			putBodyParameter("IntegratedMaskUrl", integratedMaskUrl);
		}
	}

	public String getMaskImageUrl() {
		return this.maskImageUrl;
	}

	public void setMaskImageUrl(String maskImageUrl) {
		this.maskImageUrl = maskImageUrl;
		if(maskImageUrl != null){
			putBodyParameter("MaskImageUrl", maskImageUrl);
		}
	}

	public String getReturnForm() {
		return this.returnForm;
	}

	public void setReturnForm(String returnForm) {
		this.returnForm = returnForm;
		if(returnForm != null){
			putBodyParameter("ReturnForm", returnForm);
		}
	}

	public String getNegScribbleImageUrl() {
		return this.negScribbleImageUrl;
	}

	public void setNegScribbleImageUrl(String negScribbleImageUrl) {
		this.negScribbleImageUrl = negScribbleImageUrl;
		if(negScribbleImageUrl != null){
			putBodyParameter("NegScribbleImageUrl", negScribbleImageUrl);
		}
	}

	public String getReturnFormat() {
		return this.returnFormat;
	}

	public void setReturnFormat(String returnFormat) {
		this.returnFormat = returnFormat;
		if(returnFormat != null){
			putBodyParameter("ReturnFormat", returnFormat);
		}
	}

	public String getEdgeFeathering() {
		return this.edgeFeathering;
	}

	public void setEdgeFeathering(String edgeFeathering) {
		this.edgeFeathering = edgeFeathering;
		if(edgeFeathering != null){
			putBodyParameter("EdgeFeathering", edgeFeathering);
		}
	}

	public String getImageUrl() {
		return this.imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
		if(imageUrl != null){
			putBodyParameter("ImageUrl", imageUrl);
		}
	}

	public String getPostprocessOption() {
		return this.postprocessOption;
	}

	public void setPostprocessOption(String postprocessOption) {
		this.postprocessOption = postprocessOption;
		if(postprocessOption != null){
			putBodyParameter("PostprocessOption", postprocessOption);
		}
	}

	@Override
	public Class<InteractiveScribbleSegmentationResponse> getResponseClass() {
		return InteractiveScribbleSegmentationResponse.class;
	}

}
