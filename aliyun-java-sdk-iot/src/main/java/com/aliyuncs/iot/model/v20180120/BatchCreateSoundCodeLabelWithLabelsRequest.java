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

package com.aliyuncs.iot.model.v20180120;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.iot.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class BatchCreateSoundCodeLabelWithLabelsRequest extends RpcAcsRequest<BatchCreateSoundCodeLabelWithLabelsResponse> {
	   

	private String scheduleCode;

	private String description;

	private String iotInstanceId;

	private List<String> labelss;
	public BatchCreateSoundCodeLabelWithLabelsRequest() {
		super("Iot", "2018-01-20", "BatchCreateSoundCodeLabelWithLabels");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getScheduleCode() {
		return this.scheduleCode;
	}

	public void setScheduleCode(String scheduleCode) {
		this.scheduleCode = scheduleCode;
		if(scheduleCode != null){
			putBodyParameter("ScheduleCode", scheduleCode);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putBodyParameter("Description", description);
		}
	}

	public String getIotInstanceId() {
		return this.iotInstanceId;
	}

	public void setIotInstanceId(String iotInstanceId) {
		this.iotInstanceId = iotInstanceId;
		if(iotInstanceId != null){
			putBodyParameter("IotInstanceId", iotInstanceId);
		}
	}

	public List<String> getLabelss() {
		return this.labelss;
	}

	public void setLabelss(List<String> labelss) {
		this.labelss = labelss;	
		if (labelss != null) {
			for (int i = 0; i < labelss.size(); i++) {
				putBodyParameter("Labels." + (i + 1) , labelss.get(i));
			}
		}	
	}

	@Override
	public Class<BatchCreateSoundCodeLabelWithLabelsResponse> getResponseClass() {
		return BatchCreateSoundCodeLabelWithLabelsResponse.class;
	}

}
