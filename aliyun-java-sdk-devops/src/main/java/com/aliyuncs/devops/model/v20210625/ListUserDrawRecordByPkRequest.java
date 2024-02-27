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

package com.aliyuncs.devops.model.v20210625;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListUserDrawRecordByPkRequest extends RoaAcsRequest<ListUserDrawRecordByPkResponse> {
	   

	private String aliyunPk;

	private String drawGroup;

	private String drawPoolName;
	public ListUserDrawRecordByPkRequest() {
		super("devops", "2021-06-25", "ListUserDrawRecordByPk");
		setProtocol(ProtocolType.HTTPS);
		setUriPattern("/listUserDrawRecords");
		setMethod(MethodType.GET);
	}

	public String getAliyunPk() {
		return this.aliyunPk;
	}

	public void setAliyunPk(String aliyunPk) {
		this.aliyunPk = aliyunPk;
		if(aliyunPk != null){
			putQueryParameter("aliyunPk", aliyunPk);
		}
	}

	public String getDrawGroup() {
		return this.drawGroup;
	}

	public void setDrawGroup(String drawGroup) {
		this.drawGroup = drawGroup;
		if(drawGroup != null){
			putQueryParameter("drawGroup", drawGroup);
		}
	}

	public String getDrawPoolName() {
		return this.drawPoolName;
	}

	public void setDrawPoolName(String drawPoolName) {
		this.drawPoolName = drawPoolName;
		if(drawPoolName != null){
			putQueryParameter("drawPoolName", drawPoolName);
		}
	}

	@Override
	public Class<ListUserDrawRecordByPkResponse> getResponseClass() {
		return ListUserDrawRecordByPkResponse.class;
	}

}
