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
public class RecognizeVATInvoiceRequest extends RpcAcsRequest<RecognizeVATInvoiceResponse> {
	   

	private String fileType;

	private String fileURL;
	public RecognizeVATInvoiceRequest() {
		super("ocr", "2019-12-30", "RecognizeVATInvoice", "ocr");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getFileType() {
		return this.fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
		if(fileType != null){
			putBodyParameter("FileType", fileType);
		}
	}

	public String getFileURL() {
		return this.fileURL;
	}

	public void setFileURL(String fileURL) {
		this.fileURL = fileURL;
		if(fileURL != null){
			putBodyParameter("FileURL", fileURL);
		}
	}

	@Override
	public Class<RecognizeVATInvoiceResponse> getResponseClass() {
		return RecognizeVATInvoiceResponse.class;
	}

}
