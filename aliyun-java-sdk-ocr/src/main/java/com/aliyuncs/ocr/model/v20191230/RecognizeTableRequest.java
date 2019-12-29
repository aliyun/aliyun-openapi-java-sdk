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

package com.aliyuncs.ocr.model.v20191230;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ocr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class RecognizeTableRequest extends RpcAcsRequest<RecognizeTableResponse> {
	   

	private Boolean useFinanceModel;

	private Boolean skipDetection;

	private String outputFormat;

	private String imageContent;

	private Boolean assureDirection;

	private Boolean hasLine;

	private Integer imageType;

	private String imageURL;
	public RecognizeTableRequest() {
		super("ocr", "2019-12-30", "RecognizeTable", "ocr");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getUseFinanceModel() {
		return this.useFinanceModel;
	}

	public void setUseFinanceModel(Boolean useFinanceModel) {
		this.useFinanceModel = useFinanceModel;
		if(useFinanceModel != null){
			putBodyParameter("UseFinanceModel", useFinanceModel.toString());
		}
	}

	public Boolean getSkipDetection() {
		return this.skipDetection;
	}

	public void setSkipDetection(Boolean skipDetection) {
		this.skipDetection = skipDetection;
		if(skipDetection != null){
			putBodyParameter("SkipDetection", skipDetection.toString());
		}
	}

	public String getOutputFormat() {
		return this.outputFormat;
	}

	public void setOutputFormat(String outputFormat) {
		this.outputFormat = outputFormat;
		if(outputFormat != null){
			putBodyParameter("OutputFormat", outputFormat);
		}
	}

	public String getImageContent() {
		return this.imageContent;
	}

	public void setImageContent(String imageContent) {
		this.imageContent = imageContent;
		if(imageContent != null){
			putBodyParameter("ImageContent", imageContent);
		}
	}

	public Boolean getAssureDirection() {
		return this.assureDirection;
	}

	public void setAssureDirection(Boolean assureDirection) {
		this.assureDirection = assureDirection;
		if(assureDirection != null){
			putBodyParameter("AssureDirection", assureDirection.toString());
		}
	}

	public Boolean getHasLine() {
		return this.hasLine;
	}

	public void setHasLine(Boolean hasLine) {
		this.hasLine = hasLine;
		if(hasLine != null){
			putBodyParameter("HasLine", hasLine.toString());
		}
	}

	public Integer getImageType() {
		return this.imageType;
	}

	public void setImageType(Integer imageType) {
		this.imageType = imageType;
		if(imageType != null){
			putBodyParameter("ImageType", imageType.toString());
		}
	}

	public String getImageURL() {
		return this.imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
		if(imageURL != null){
			putBodyParameter("ImageURL", imageURL);
		}
	}

	@Override
	public Class<RecognizeTableResponse> getResponseClass() {
		return RecognizeTableResponse.class;
	}

}
