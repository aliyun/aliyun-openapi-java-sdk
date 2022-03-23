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

package com.aliyuncs.copyright.model.v20190123;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class RecognizeGeneralTextRequest extends RpcAcsRequest<RecognizeGeneralTextResponse> {
	   

	private String data;

	private String bizCode;

	private String fileInfo;

	private String label;

	private String text;

	private String fileProcessType;

	private String type;
	public RecognizeGeneralTextRequest() {
		super("Copyright", "2019-01-23", "RecognizeGeneralText");
		setMethod(MethodType.POST);
	}

	public String getData() {
		return this.data;
	}

	public void setData(String data) {
		this.data = data;
		if(data != null){
			putBodyParameter("Data", data);
		}
	}

	public String getBizCode() {
		return this.bizCode;
	}

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
		if(bizCode != null){
			putQueryParameter("BizCode", bizCode);
		}
	}

	public String getFileInfo() {
		return this.fileInfo;
	}

	public void setFileInfo(String fileInfo) {
		this.fileInfo = fileInfo;
		if(fileInfo != null){
			putQueryParameter("FileInfo", fileInfo);
		}
	}

	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
		if(label != null){
			putBodyParameter("Label", label);
		}
	}

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
		if(text != null){
			putQueryParameter("Text", text);
		}
	}

	public String getFileProcessType() {
		return this.fileProcessType;
	}

	public void setFileProcessType(String fileProcessType) {
		this.fileProcessType = fileProcessType;
		if(fileProcessType != null){
			putQueryParameter("FileProcessType", fileProcessType);
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
		}
	}

	@Override
	public Class<RecognizeGeneralTextResponse> getResponseClass() {
		return RecognizeGeneralTextResponse.class;
	}

}
