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

package com.aliyuncs.wyota.model.v20210420;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class AttachLabelsRequest extends RpcAcsRequest<AttachLabelsResponse> {
	   

	private String serialNo;

	private String serialNoList;

	private String labelIds;
	public AttachLabelsRequest() {
		super("wyota", "2021-04-20", "AttachLabels");
		setMethod(MethodType.POST);
	}

	public String getSerialNo() {
		return this.serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
		if(serialNo != null){
			putBodyParameter("SerialNo", serialNo);
		}
	}

	public String getSerialNoList() {
		return this.serialNoList;
	}

	public void setSerialNoList(String serialNoList) {
		this.serialNoList = serialNoList;
		if(serialNoList != null){
			putBodyParameter("SerialNoList", serialNoList);
		}
	}

	public String getLabelIds() {
		return this.labelIds;
	}

	public void setLabelIds(String labelIds) {
		this.labelIds = labelIds;
		if(labelIds != null){
			putBodyParameter("LabelIds", labelIds);
		}
	}

	@Override
	public Class<AttachLabelsResponse> getResponseClass() {
		return AttachLabelsResponse.class;
	}

}
