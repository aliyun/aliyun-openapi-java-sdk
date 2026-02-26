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

package com.aliyuncs.cs.model.v20151215;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cs.transform.v20151215.DescribeTaskInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeTaskInfoResponse extends AcsResponse {

	private String task_id;

	private String cluster_id;

	private String task_type;

	private String state;

	private String created;

	private String updated;

	private Map<Object,Object> parameters;

	private String current_stage;

	private List<StagesItem> stages;

	private List<EventsItem> events;

	private List<Task> task_result;

	private Target target;

	private Error error;

	public String getTask_id() {
		return this.task_id;
	}

	public void setTask_id(String task_id) {
		this.task_id = task_id;
	}

	public String getCluster_id() {
		return this.cluster_id;
	}

	public void setCluster_id(String cluster_id) {
		this.cluster_id = cluster_id;
	}

	public String getTask_type() {
		return this.task_type;
	}

	public void setTask_type(String task_type) {
		this.task_type = task_type;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCreated() {
		return this.created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public String getUpdated() {
		return this.updated;
	}

	public void setUpdated(String updated) {
		this.updated = updated;
	}

	public Map<Object,Object> getParameters() {
		return this.parameters;
	}

	public void setParameters(Map<Object,Object> parameters) {
		this.parameters = parameters;
	}

	public String getCurrent_stage() {
		return this.current_stage;
	}

	public void setCurrent_stage(String current_stage) {
		this.current_stage = current_stage;
	}

	public List<StagesItem> getStages() {
		return this.stages;
	}

	public void setStages(List<StagesItem> stages) {
		this.stages = stages;
	}

	public List<EventsItem> getEvents() {
		return this.events;
	}

	public void setEvents(List<EventsItem> events) {
		this.events = events;
	}

	public List<Task> getTask_result() {
		return this.task_result;
	}

	public void setTask_result(List<Task> task_result) {
		this.task_result = task_result;
	}

	public Target getTarget() {
		return this.target;
	}

	public void setTarget(Target target) {
		this.target = target;
	}

	public Error getError() {
		return this.error;
	}

	public void setError(Error error) {
		this.error = error;
	}

	public static class StagesItem {

		private String state;

		private String start_time;

		private String end_time;

		private String message;

		private Map<Object,Object> outputs;

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getStart_time() {
			return this.start_time;
		}

		public void setStart_time(String start_time) {
			this.start_time = start_time;
		}

		public String getEnd_time() {
			return this.end_time;
		}

		public void setEnd_time(String end_time) {
			this.end_time = end_time;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public Map<Object,Object> getOutputs() {
			return this.outputs;
		}

		public void setOutputs(Map<Object,Object> outputs) {
			this.outputs = outputs;
		}
	}

	public static class EventsItem {

		private String action;

		private String level;

		private String message;

		private String reason;

		private String source;

		private String timestamp;

		public String getAction() {
			return this.action;
		}

		public void setAction(String action) {
			this.action = action;
		}

		public String getLevel() {
			return this.level;
		}

		public void setLevel(String level) {
			this.level = level;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getReason() {
			return this.reason;
		}

		public void setReason(String reason) {
			this.reason = reason;
		}

		public String getSource() {
			return this.source;
		}

		public void setSource(String source) {
			this.source = source;
		}

		public String getTimestamp() {
			return this.timestamp;
		}

		public void setTimestamp(String timestamp) {
			this.timestamp = timestamp;
		}
	}

	public static class Task {

		private String data;

		private String status;

		public String getData() {
			return this.data;
		}

		public void setData(String data) {
			this.data = data;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

	public static class Target {

		private String id;

		private String type;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}
	}

	public static class Error {

		private String code;

		private String message;

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}
	}

	@Override
	public DescribeTaskInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeTaskInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
