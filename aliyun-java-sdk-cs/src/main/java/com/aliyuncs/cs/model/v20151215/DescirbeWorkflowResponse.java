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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cs.transform.v20151215.DescirbeWorkflowResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescirbeWorkflowResponse extends AcsResponse {

	private String create_time;

	private String duration;

	private String finish_time;

	private String input_data_size;

	private String job_name;

	private String job_namespace;

	private String output_data_size;

	private String status;

	private String total_bases;

	private String total_reads;

	private String user_input_data;

	public String getCreate_time() {
		return this.create_time;
	}

	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}

	public String getDuration() {
		return this.duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getFinish_time() {
		return this.finish_time;
	}

	public void setFinish_time(String finish_time) {
		this.finish_time = finish_time;
	}

	public String getInput_data_size() {
		return this.input_data_size;
	}

	public void setInput_data_size(String input_data_size) {
		this.input_data_size = input_data_size;
	}

	public String getJob_name() {
		return this.job_name;
	}

	public void setJob_name(String job_name) {
		this.job_name = job_name;
	}

	public String getJob_namespace() {
		return this.job_namespace;
	}

	public void setJob_namespace(String job_namespace) {
		this.job_namespace = job_namespace;
	}

	public String getOutput_data_size() {
		return this.output_data_size;
	}

	public void setOutput_data_size(String output_data_size) {
		this.output_data_size = output_data_size;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTotal_bases() {
		return this.total_bases;
	}

	public void setTotal_bases(String total_bases) {
		this.total_bases = total_bases;
	}

	public String getTotal_reads() {
		return this.total_reads;
	}

	public void setTotal_reads(String total_reads) {
		this.total_reads = total_reads;
	}

	public String getUser_input_data() {
		return this.user_input_data;
	}

	public void setUser_input_data(String user_input_data) {
		this.user_input_data = user_input_data;
	}

	@Override
	public DescirbeWorkflowResponse getInstance(UnmarshallerContext context) {
		return	DescirbeWorkflowResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
