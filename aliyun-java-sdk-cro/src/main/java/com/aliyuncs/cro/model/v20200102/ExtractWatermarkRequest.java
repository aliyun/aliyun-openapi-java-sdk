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

package com.aliyuncs.cro.model.v20200102;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ExtractWatermarkRequest extends RpcAcsRequest<ExtractWatermarkResponse> {
	   

	private String fileType;

	private String carrierLink;

	private String extendParams;

	private String scene;
	public ExtractWatermarkRequest() {
		super("CRO", "2020-01-02", "ExtractWatermark", "cro");
		setMethod(MethodType.POST);
	}

	public String getFileType() {
		return this.fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
		if(fileType != null){
			putQueryParameter("FileType", fileType);
		}
	}

	public String getCarrierLink() {
		return this.carrierLink;
	}

	public void setCarrierLink(String carrierLink) {
		this.carrierLink = carrierLink;
		if(carrierLink != null){
			putQueryParameter("CarrierLink", carrierLink);
		}
	}

	public String getExtendParams() {
		return this.extendParams;
	}

	public void setExtendParams(String extendParams) {
		this.extendParams = extendParams;
		if(extendParams != null){
			putBodyParameter("ExtendParams", extendParams);
		}
	}

	public String getScene() {
		return this.scene;
	}

	public void setScene(String scene) {
		this.scene = scene;
		if(scene != null){
			putQueryParameter("Scene", scene);
		}
	}

	@Override
	public Class<ExtractWatermarkResponse> getResponseClass() {
		return ExtractWatermarkResponse.class;
	}

}
