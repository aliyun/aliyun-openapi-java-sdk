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

package com.aliyuncs.sas.model.v20181203;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.DescribeSuspEventDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSuspEventDetailResponse extends AcsResponse {

	private String type;

	private String dataSource;

	private String eventName;

	private String internetIp;

	private String alarmUniqueInfo;

	private String intranetIp;

	private String lastTime;

	private String operateMsg;

	private String uuid;

	private Boolean canBeDealOnLine;

	private String requestId;

	private String accessCode;

	private String eventTypeDesc;

	private String eventDesc;

	private String instanceName;

	private String eventStatus;

	private String saleVersion;

	private String operateErrorCode;

	private String sasId;

	private String level;

	private Integer id;

	private List<QuaraFile> details;

	private List<EventNote> eventNotes;

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDataSource() {
		return this.dataSource;
	}

	public void setDataSource(String dataSource) {
		this.dataSource = dataSource;
	}

	public String getEventName() {
		return this.eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getInternetIp() {
		return this.internetIp;
	}

	public void setInternetIp(String internetIp) {
		this.internetIp = internetIp;
	}

	public String getAlarmUniqueInfo() {
		return this.alarmUniqueInfo;
	}

	public void setAlarmUniqueInfo(String alarmUniqueInfo) {
		this.alarmUniqueInfo = alarmUniqueInfo;
	}

	public String getIntranetIp() {
		return this.intranetIp;
	}

	public void setIntranetIp(String intranetIp) {
		this.intranetIp = intranetIp;
	}

	public String getLastTime() {
		return this.lastTime;
	}

	public void setLastTime(String lastTime) {
		this.lastTime = lastTime;
	}

	public String getOperateMsg() {
		return this.operateMsg;
	}

	public void setOperateMsg(String operateMsg) {
		this.operateMsg = operateMsg;
	}

	public String getUuid() {
		return this.uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public Boolean getCanBeDealOnLine() {
		return this.canBeDealOnLine;
	}

	public void setCanBeDealOnLine(Boolean canBeDealOnLine) {
		this.canBeDealOnLine = canBeDealOnLine;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getAccessCode() {
		return this.accessCode;
	}

	public void setAccessCode(String accessCode) {
		this.accessCode = accessCode;
	}

	public String getEventTypeDesc() {
		return this.eventTypeDesc;
	}

	public void setEventTypeDesc(String eventTypeDesc) {
		this.eventTypeDesc = eventTypeDesc;
	}

	public String getEventDesc() {
		return this.eventDesc;
	}

	public void setEventDesc(String eventDesc) {
		this.eventDesc = eventDesc;
	}

	public String getInstanceName() {
		return this.instanceName;
	}

	public void setInstanceName(String instanceName) {
		this.instanceName = instanceName;
	}

	public String getEventStatus() {
		return this.eventStatus;
	}

	public void setEventStatus(String eventStatus) {
		this.eventStatus = eventStatus;
	}

	public String getSaleVersion() {
		return this.saleVersion;
	}

	public void setSaleVersion(String saleVersion) {
		this.saleVersion = saleVersion;
	}

	public String getOperateErrorCode() {
		return this.operateErrorCode;
	}

	public void setOperateErrorCode(String operateErrorCode) {
		this.operateErrorCode = operateErrorCode;
	}

	public String getSasId() {
		return this.sasId;
	}

	public void setSasId(String sasId) {
		this.sasId = sasId;
	}

	public String getLevel() {
		return this.level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<QuaraFile> getDetails() {
		return this.details;
	}

	public void setDetails(List<QuaraFile> details) {
		this.details = details;
	}

	public List<EventNote> getEventNotes() {
		return this.eventNotes;
	}

	public void setEventNotes(List<EventNote> eventNotes) {
		this.eventNotes = eventNotes;
	}

	public static class QuaraFile {

		private String type;

		private String value;

		private String valueDisplay;

		private String infoType;

		private String nameDisplay;

		private String name;

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getValueDisplay() {
			return this.valueDisplay;
		}

		public void setValueDisplay(String valueDisplay) {
			this.valueDisplay = valueDisplay;
		}

		public String getInfoType() {
			return this.infoType;
		}

		public void setInfoType(String infoType) {
			this.infoType = infoType;
		}

		public String getNameDisplay() {
			return this.nameDisplay;
		}

		public void setNameDisplay(String nameDisplay) {
			this.nameDisplay = nameDisplay;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}

	public static class EventNote {

		private String note;

		private Long noteId;

		private String noteTime;

		public String getNote() {
			return this.note;
		}

		public void setNote(String note) {
			this.note = note;
		}

		public Long getNoteId() {
			return this.noteId;
		}

		public void setNoteId(Long noteId) {
			this.noteId = noteId;
		}

		public String getNoteTime() {
			return this.noteTime;
		}

		public void setNoteTime(String noteTime) {
			this.noteTime = noteTime;
		}
	}

	@Override
	public DescribeSuspEventDetailResponse getInstance(UnmarshallerContext context) {
		return	DescribeSuspEventDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
