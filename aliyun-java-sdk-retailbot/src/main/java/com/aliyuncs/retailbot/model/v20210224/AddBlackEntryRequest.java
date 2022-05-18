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

package com.aliyuncs.retailbot.model.v20210224;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class AddBlackEntryRequest extends RpcAcsRequest<AddBlackEntryResponse> {
	   

	private Integer slotId;

	private String blackEntryValue;

	private String robotCode;
	public AddBlackEntryRequest() {
		super("RetailBot", "2021-02-24", "AddBlackEntry");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public Integer getSlotId() {
		return this.slotId;
	}

	public void setSlotId(Integer slotId) {
		this.slotId = slotId;
		if(slotId != null){
			putBodyParameter("SlotId", slotId.toString());
		}
	}

	public String getBlackEntryValue() {
		return this.blackEntryValue;
	}

	public void setBlackEntryValue(String blackEntryValue) {
		this.blackEntryValue = blackEntryValue;
		if(blackEntryValue != null){
			putBodyParameter("BlackEntryValue", blackEntryValue);
		}
	}

	public String getRobotCode() {
		return this.robotCode;
	}

	public void setRobotCode(String robotCode) {
		this.robotCode = robotCode;
		if(robotCode != null){
			putBodyParameter("RobotCode", robotCode);
		}
	}

	@Override
	public Class<AddBlackEntryResponse> getResponseClass() {
		return AddBlackEntryResponse.class;
	}

}
