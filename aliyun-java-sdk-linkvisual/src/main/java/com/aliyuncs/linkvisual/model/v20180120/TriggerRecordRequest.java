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

package com.aliyuncs.linkvisual.model.v20180120;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class TriggerRecordRequest extends RpcAcsRequest<TriggerRecordResponse> {
	   

	private String iotId;

	private Integer streamType;

	private Integer preRecordDuration;

	private Integer recordDuration;
	public TriggerRecordRequest() {
		super("Linkvisual", "2018-01-20", "TriggerRecord", "linkvisual");
		setMethod(MethodType.POST);
	}

	public String getIotId() {
		return this.iotId;
	}

	public void setIotId(String iotId) {
		this.iotId = iotId;
		if(iotId != null){
			putQueryParameter("IotId", iotId);
		}
	}

	public Integer getStreamType() {
		return this.streamType;
	}

	public void setStreamType(Integer streamType) {
		this.streamType = streamType;
		if(streamType != null){
			putQueryParameter("StreamType", streamType.toString());
		}
	}

	public Integer getPreRecordDuration() {
		return this.preRecordDuration;
	}

	public void setPreRecordDuration(Integer preRecordDuration) {
		this.preRecordDuration = preRecordDuration;
		if(preRecordDuration != null){
			putQueryParameter("PreRecordDuration", preRecordDuration.toString());
		}
	}

	public Integer getRecordDuration() {
		return this.recordDuration;
	}

	public void setRecordDuration(Integer recordDuration) {
		this.recordDuration = recordDuration;
		if(recordDuration != null){
			putQueryParameter("RecordDuration", recordDuration.toString());
		}
	}

	@Override
	public Class<TriggerRecordResponse> getResponseClass() {
		return TriggerRecordResponse.class;
	}

}
