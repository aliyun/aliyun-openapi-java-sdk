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
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class SendOpsMessageToTerminalsRequest extends RpcAcsRequest<SendOpsMessageToTerminalsResponse> {
	   

	private String msg;

	private String opsAction;

	private Boolean waitForAck;

	private List<String> uuids;
	public SendOpsMessageToTerminalsRequest() {
		super("wyota", "2021-04-20", "SendOpsMessageToTerminals");
		setMethod(MethodType.POST);
	}

	public String getMsg() {
		return this.msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
		if(msg != null){
			putBodyParameter("Msg", msg);
		}
	}

	public String getOpsAction() {
		return this.opsAction;
	}

	public void setOpsAction(String opsAction) {
		this.opsAction = opsAction;
		if(opsAction != null){
			putBodyParameter("OpsAction", opsAction);
		}
	}

	public Boolean getWaitForAck() {
		return this.waitForAck;
	}

	public void setWaitForAck(Boolean waitForAck) {
		this.waitForAck = waitForAck;
		if(waitForAck != null){
			putBodyParameter("WaitForAck", waitForAck.toString());
		}
	}

	public List<String> getUuids() {
		return this.uuids;
	}

	public void setUuids(List<String> uuids) {
		this.uuids = uuids;	
		if (uuids != null) {
			for (int depth1 = 0; depth1 < uuids.size(); depth1++) {
				putBodyParameter("Uuids." + (depth1 + 1) , uuids.get(depth1));
			}
		}	
	}

	@Override
	public Class<SendOpsMessageToTerminalsResponse> getResponseClass() {
		return SendOpsMessageToTerminalsResponse.class;
	}

}
