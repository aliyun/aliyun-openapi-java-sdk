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

package com.aliyuncs.afs.model.v20180112;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class SetEarlyWarningRequest extends RpcAcsRequest<SetEarlyWarningResponse> {
	
	public SetEarlyWarningRequest() {
		super("afs", "2018-01-12", "SetEarlyWarning", "afs");
	}

	private String timeEnd;

	private Boolean warnOpen;

	private String sourceIp;

	private String channel;

	private String title;

	private Boolean timeOpen;

	private String timeBegin;

	private String frequency;

	public String getTimeEnd() {
		return this.timeEnd;
	}

	public void setTimeEnd(String timeEnd) {
		this.timeEnd = timeEnd;
		if(timeEnd != null){
			putQueryParameter("TimeEnd", timeEnd);
		}
	}

	public Boolean getWarnOpen() {
		return this.warnOpen;
	}

	public void setWarnOpen(Boolean warnOpen) {
		this.warnOpen = warnOpen;
		if(warnOpen != null){
			putQueryParameter("WarnOpen", warnOpen.toString());
		}
	}

	public String getSourceIp() {
		return this.sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
		if(sourceIp != null){
			putQueryParameter("SourceIp", sourceIp);
		}
	}

	public String getChannel() {
		return this.channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
		if(channel != null){
			putQueryParameter("Channel", channel);
		}
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
		if(title != null){
			putQueryParameter("Title", title);
		}
	}

	public Boolean getTimeOpen() {
		return this.timeOpen;
	}

	public void setTimeOpen(Boolean timeOpen) {
		this.timeOpen = timeOpen;
		if(timeOpen != null){
			putQueryParameter("TimeOpen", timeOpen.toString());
		}
	}

	public String getTimeBegin() {
		return this.timeBegin;
	}

	public void setTimeBegin(String timeBegin) {
		this.timeBegin = timeBegin;
		if(timeBegin != null){
			putQueryParameter("TimeBegin", timeBegin);
		}
	}

	public String getFrequency() {
		return this.frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
		if(frequency != null){
			putQueryParameter("Frequency", frequency);
		}
	}

	@Override
	public Class<SetEarlyWarningResponse> getResponseClass() {
		return SetEarlyWarningResponse.class;
	}

}
