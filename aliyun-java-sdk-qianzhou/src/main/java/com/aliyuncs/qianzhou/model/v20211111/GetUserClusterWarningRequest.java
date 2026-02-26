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

package com.aliyuncs.qianzhou.model.v20211111;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetUserClusterWarningRequest extends RoaAcsRequest<GetUserClusterWarningResponse> {
	   

	private String userID;
	public GetUserClusterWarningRequest() {
		super("qianzhou", "2021-11-11", "GetUserClusterWarning");
		setUriPattern("/popapi/listUserKeyClusters");
		setMethod(MethodType.GET);
	}

	public String getUserID() {
		return this.userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
		if(userID != null){
			putQueryParameter("userID", userID);
		}
	}

	@Override
	public Class<GetUserClusterWarningResponse> getResponseClass() {
		return GetUserClusterWarningResponse.class;
	}

}
