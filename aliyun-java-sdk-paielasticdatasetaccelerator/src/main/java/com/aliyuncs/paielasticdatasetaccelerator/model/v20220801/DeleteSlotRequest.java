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

package com.aliyuncs.paielasticdatasetaccelerator.model.v20220801;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DeleteSlotRequest extends RoaAcsRequest<DeleteSlotResponse> {
	   

	private String slotId;

	private Boolean force;
	public DeleteSlotRequest() {
		super("PAIElasticDatasetAccelerator", "2022-08-01", "DeleteSlot", "datasetacc");
		setUriPattern("/api/v1/slots/[SlotId]");
		setMethod(MethodType.DELETE);
	}

	public String getSlotId() {
		return this.slotId;
	}

	public void setSlotId(String slotId) {
		this.slotId = slotId;
		if(slotId != null){
			putPathParameter("SlotId", slotId);
		}
	}

	public Boolean getForce() {
		return this.force;
	}

	public void setForce(Boolean force) {
		this.force = force;
		if(force != null){
			putQueryParameter("Force", force.toString());
		}
	}

	@Override
	public Class<DeleteSlotResponse> getResponseClass() {
		return DeleteSlotResponse.class;
	}

}
