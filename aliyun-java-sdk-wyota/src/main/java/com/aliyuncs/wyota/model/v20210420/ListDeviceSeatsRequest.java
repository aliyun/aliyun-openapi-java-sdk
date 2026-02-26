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
public class ListDeviceSeatsRequest extends RpcAcsRequest<ListDeviceSeatsResponse> {
	   

	private String label;

	private List<String> serialNoLists;

	private String tenantId;

	private String zoneId;

	private String seatNo;
	public ListDeviceSeatsRequest() {
		super("wyota", "2021-04-20", "ListDeviceSeats");
		setMethod(MethodType.POST);
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

	public List<String> getSerialNoLists() {
		return this.serialNoLists;
	}

	public void setSerialNoLists(List<String> serialNoLists) {
		this.serialNoLists = serialNoLists;	
		if (serialNoLists != null) {
			for (int i = 0; i < serialNoLists.size(); i++) {
				putBodyParameter("SerialNoList." + (i + 1) , serialNoLists.get(i));
			}
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

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
		if(zoneId != null){
			putBodyParameter("ZoneId", zoneId);
		}
	}

	public String getSeatNo() {
		return this.seatNo;
	}

	public void setSeatNo(String seatNo) {
		this.seatNo = seatNo;
		if(seatNo != null){
			putBodyParameter("SeatNo", seatNo);
		}
	}

	@Override
	public Class<ListDeviceSeatsResponse> getResponseClass() {
		return ListDeviceSeatsResponse.class;
	}

}
