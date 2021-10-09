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

package com.aliyuncs.mindlive.model.v20210301;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateLiveTeleprompterStateRequest extends RpcAcsRequest<UpdateLiveTeleprompterStateResponse> {
	   

	private Boolean display;
	public UpdateLiveTeleprompterStateRequest() {
		super("MindLive", "2021-03-01", "UpdateLiveTeleprompterState");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public Boolean getDisplay() {
		return this.display;
	}

	public void setDisplay(Boolean display) {
		this.display = display;
		if(display != null){
			putQueryParameter("Display", display.toString());
		}
	}

	@Override
	public Class<UpdateLiveTeleprompterStateResponse> getResponseClass() {
		return UpdateLiveTeleprompterStateResponse.class;
	}

}
