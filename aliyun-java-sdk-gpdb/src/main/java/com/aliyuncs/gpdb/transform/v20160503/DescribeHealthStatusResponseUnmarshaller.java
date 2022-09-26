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

package com.aliyuncs.gpdb.transform.v20160503;

import com.aliyuncs.gpdb.model.v20160503.DescribeHealthStatusResponse;
import com.aliyuncs.gpdb.model.v20160503.DescribeHealthStatusResponse.Status;
import com.aliyuncs.gpdb.model.v20160503.DescribeHealthStatusResponse.Status.Adbgp_segment_disk_usage_percent_max;
import com.aliyuncs.gpdb.model.v20160503.DescribeHealthStatusResponse.Status.Adbpg_connection_status;
import com.aliyuncs.gpdb.model.v20160503.DescribeHealthStatusResponse.Status.Adbpg_disk_status;
import com.aliyuncs.gpdb.model.v20160503.DescribeHealthStatusResponse.Status.Adbpg_disk_usage_percent;
import com.aliyuncs.gpdb.model.v20160503.DescribeHealthStatusResponse.Status.Adbpg_master_disk_usage_percent_max;
import com.aliyuncs.gpdb.model.v20160503.DescribeHealthStatusResponse.Status.Adbpg_master_status;
import com.aliyuncs.gpdb.model.v20160503.DescribeHealthStatusResponse.Status.Adbpg_segment_status;
import com.aliyuncs.gpdb.model.v20160503.DescribeHealthStatusResponse.Status.Adbpg_status;
import com.aliyuncs.gpdb.model.v20160503.DescribeHealthStatusResponse.Status.Node_master_connection_status;
import com.aliyuncs.gpdb.model.v20160503.DescribeHealthStatusResponse.Status.Node_master_status;
import com.aliyuncs.gpdb.model.v20160503.DescribeHealthStatusResponse.Status.Node_segment_connection_status;
import com.aliyuncs.gpdb.model.v20160503.DescribeHealthStatusResponse.Status.Node_segment_disk_status;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeHealthStatusResponseUnmarshaller {

	public static DescribeHealthStatusResponse unmarshall(DescribeHealthStatusResponse describeHealthStatusResponse, UnmarshallerContext _ctx) {
		
		describeHealthStatusResponse.setRequestId(_ctx.stringValue("DescribeHealthStatusResponse.RequestId"));
		describeHealthStatusResponse.setDBClusterId(_ctx.stringValue("DescribeHealthStatusResponse.DBClusterId"));

		Status status = new Status();

		Adbpg_status adbpg_status = new Adbpg_status();
		adbpg_status.setStatus(_ctx.stringValue("DescribeHealthStatusResponse.Status.adbpg_status.Status"));
		adbpg_status.setValue(_ctx.floatValue("DescribeHealthStatusResponse.Status.adbpg_status.Value"));
		status.setAdbpg_status(adbpg_status);

		Adbpg_connection_status adbpg_connection_status = new Adbpg_connection_status();
		adbpg_connection_status.setStatus(_ctx.stringValue("DescribeHealthStatusResponse.Status.adbpg_connection_status.Status"));
		adbpg_connection_status.setValue(_ctx.floatValue("DescribeHealthStatusResponse.Status.adbpg_connection_status.Value"));
		status.setAdbpg_connection_status(adbpg_connection_status);

		Adbpg_disk_status adbpg_disk_status = new Adbpg_disk_status();
		adbpg_disk_status.setStatus(_ctx.stringValue("DescribeHealthStatusResponse.Status.adbpg_disk_status.Status"));
		adbpg_disk_status.setValue(_ctx.floatValue("DescribeHealthStatusResponse.Status.adbpg_disk_status.Value"));
		status.setAdbpg_disk_status(adbpg_disk_status);

		Adbpg_disk_usage_percent adbpg_disk_usage_percent = new Adbpg_disk_usage_percent();
		adbpg_disk_usage_percent.setStatus(_ctx.stringValue("DescribeHealthStatusResponse.Status.adbpg_disk_usage_percent.Status"));
		adbpg_disk_usage_percent.setValue(_ctx.floatValue("DescribeHealthStatusResponse.Status.adbpg_disk_usage_percent.Value"));
		status.setAdbpg_disk_usage_percent(adbpg_disk_usage_percent);

		Adbpg_master_disk_usage_percent_max adbpg_master_disk_usage_percent_max = new Adbpg_master_disk_usage_percent_max();
		adbpg_master_disk_usage_percent_max.setStatus(_ctx.stringValue("DescribeHealthStatusResponse.Status.adbpg_master_disk_usage_percent_max.Status"));
		adbpg_master_disk_usage_percent_max.setValue(_ctx.floatValue("DescribeHealthStatusResponse.Status.adbpg_master_disk_usage_percent_max.Value"));
		status.setAdbpg_master_disk_usage_percent_max(adbpg_master_disk_usage_percent_max);

		Adbgp_segment_disk_usage_percent_max adbgp_segment_disk_usage_percent_max = new Adbgp_segment_disk_usage_percent_max();
		adbgp_segment_disk_usage_percent_max.setStatus(_ctx.stringValue("DescribeHealthStatusResponse.Status.adbgp_segment_disk_usage_percent_max.Status"));
		adbgp_segment_disk_usage_percent_max.setValue(_ctx.floatValue("DescribeHealthStatusResponse.Status.adbgp_segment_disk_usage_percent_max.Value"));
		status.setAdbgp_segment_disk_usage_percent_max(adbgp_segment_disk_usage_percent_max);

		Node_master_status node_master_status = new Node_master_status();
		node_master_status.setStatus(_ctx.stringValue("DescribeHealthStatusResponse.Status.node_master_status.Status"));
		node_master_status.setValue(_ctx.floatValue("DescribeHealthStatusResponse.Status.node_master_status.Value"));
		status.setNode_master_status(node_master_status);

		Node_segment_disk_status node_segment_disk_status = new Node_segment_disk_status();
		node_segment_disk_status.setStatus(_ctx.stringValue("DescribeHealthStatusResponse.Status.node_segment_disk_status.Status"));
		node_segment_disk_status.setValue(_ctx.floatValue("DescribeHealthStatusResponse.Status.node_segment_disk_status.Value"));
		status.setNode_segment_disk_status(node_segment_disk_status);

		Node_master_connection_status node_master_connection_status = new Node_master_connection_status();
		node_master_connection_status.setStatus(_ctx.stringValue("DescribeHealthStatusResponse.Status.node_master_connection_status.Status"));
		node_master_connection_status.setValue(_ctx.floatValue("DescribeHealthStatusResponse.Status.node_master_connection_status.Value"));
		status.setNode_master_connection_status(node_master_connection_status);

		Node_segment_connection_status node_segment_connection_status = new Node_segment_connection_status();
		node_segment_connection_status.setStatus(_ctx.stringValue("DescribeHealthStatusResponse.Status.node_segment_connection_status.Status"));
		node_segment_connection_status.setValue(_ctx.floatValue("DescribeHealthStatusResponse.Status.node_segment_connection_status.Value"));
		status.setNode_segment_connection_status(node_segment_connection_status);

		Adbpg_master_status adbpg_master_status = new Adbpg_master_status();
		adbpg_master_status.setStatus(_ctx.stringValue("DescribeHealthStatusResponse.Status.adbpg_master_status.Status"));
		adbpg_master_status.setValue(_ctx.floatValue("DescribeHealthStatusResponse.Status.adbpg_master_status.Value"));
		status.setAdbpg_master_status(adbpg_master_status);

		Adbpg_segment_status adbpg_segment_status = new Adbpg_segment_status();
		adbpg_segment_status.setStatus(_ctx.stringValue("DescribeHealthStatusResponse.Status.adbpg_segment_status.Status"));
		adbpg_segment_status.setValue(_ctx.floatValue("DescribeHealthStatusResponse.Status.adbpg_segment_status.Value"));
		status.setAdbpg_segment_status(adbpg_segment_status);
		describeHealthStatusResponse.setStatus(status);
	 
	 	return describeHealthStatusResponse;
	}
}