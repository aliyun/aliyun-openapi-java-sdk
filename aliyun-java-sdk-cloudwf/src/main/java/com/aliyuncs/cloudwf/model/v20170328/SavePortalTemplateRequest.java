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

package com.aliyuncs.cloudwf.model.v20170328;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class SavePortalTemplateRequest extends RpcAcsRequest<SavePortalTemplateResponse> {
	
	public SavePortalTemplateRequest() {
		super("cloudwf", "2017-03-28", "SavePortalTemplate", "cloudwf");
	}

	private String textContent;

	private String tempName;

	private String textAlign;

	private String textColor;

	private Long id;

	private Long ossFileId;

	public String getTextContent() {
		return this.textContent;
	}

	public void setTextContent(String textContent) {
		this.textContent = textContent;
		if(textContent != null){
			putQueryParameter("TextContent", textContent);
		}
	}

	public String getTempName() {
		return this.tempName;
	}

	public void setTempName(String tempName) {
		this.tempName = tempName;
		if(tempName != null){
			putQueryParameter("TempName", tempName);
		}
	}

	public String getTextAlign() {
		return this.textAlign;
	}

	public void setTextAlign(String textAlign) {
		this.textAlign = textAlign;
		if(textAlign != null){
			putQueryParameter("TextAlign", textAlign);
		}
	}

	public String getTextColor() {
		return this.textColor;
	}

	public void setTextColor(String textColor) {
		this.textColor = textColor;
		if(textColor != null){
			putQueryParameter("TextColor", textColor);
		}
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id.toString());
		}
	}

	public Long getOssFileId() {
		return this.ossFileId;
	}

	public void setOssFileId(Long ossFileId) {
		this.ossFileId = ossFileId;
		if(ossFileId != null){
			putQueryParameter("OssFileId", ossFileId.toString());
		}
	}

	@Override
	public Class<SavePortalTemplateResponse> getResponseClass() {
		return SavePortalTemplateResponse.class;
	}

}
