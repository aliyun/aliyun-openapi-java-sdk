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
public class AddDeviceSeatsAndLabelsRequest extends RpcAcsRequest<AddDeviceSeatsAndLabelsResponse> {
	   

	private List<String> labelLists;

	private Boolean isUnique;

	private String tenantId;

	private String seatName;

	private String zoneId;

	private String label;

	private String serialNo;
	public AddDeviceSeatsAndLabelsRequest() {
		super("wyota", "2021-04-20", "AddDeviceSeatsAndLabels");
		setMethod(MethodType.POST);
	}

	public List<String> getLabelLists() {
		return this.labelLists;
	}

	public void setLabelLists(List<String> labelLists) {
		this.labelLists = labelLists;	
		if (labelLists != null) {
			for (int i = 0; i < labelLists.size(); i++) {
				putBodyParameter("LabelList." + (i + 1) , labelLists.get(i));
			}
		}	
	}

	public Boolean getIsUnique() {
		return this.isUnique;
	}

	public void setIsUnique(Boolean isUnique) {
		this.isUnique = isUnique;
		if(isUnique != null){
			putBodyParameter("IsUnique", isUnique.toString());
		}
	}

	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
		if(tenantId != null){
			putBodyParameter("TenantId", tenantId);
		}
	}

	public String getSeatName() {
		return this.seatName;
	}

	public void setSeatName(String seatName) {
		this.seatName = seatName;
		if(seatName != null){
			putBodyParameter("SeatName", seatName);
		}
	}

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
		if(zoneId != null){
			putBodyParameter("ZoneId", zoneId);
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

	public String getSerialNo() {
		return this.serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
		if(serialNo != null){
			putBodyParameter("SerialNo", serialNo);
		}
	}

	@Override
	public Class<AddDeviceSeatsAndLabelsResponse> getResponseClass() {
		return AddDeviceSeatsAndLabelsResponse.class;
	}

}
