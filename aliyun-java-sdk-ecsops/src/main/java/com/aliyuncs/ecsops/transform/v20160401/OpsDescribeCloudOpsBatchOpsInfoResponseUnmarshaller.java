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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeCloudOpsBatchOpsInfoResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeCloudOpsBatchOpsInfoResponse.Data;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeCloudOpsBatchOpsInfoResponse.Data.BatchOpsInfoData;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeCloudOpsBatchOpsInfoResponse.Data.BatchOpsInfoData.BatchOpsInfo;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeCloudOpsBatchOpsInfoResponse.Data.BatchOpsTaskData;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeCloudOpsBatchOpsInfoResponseUnmarshaller {

	public static OpsDescribeCloudOpsBatchOpsInfoResponse unmarshall(OpsDescribeCloudOpsBatchOpsInfoResponse opsDescribeCloudOpsBatchOpsInfoResponse, UnmarshallerContext _ctx) {
		
		opsDescribeCloudOpsBatchOpsInfoResponse.setRequestId(_ctx.stringValue("OpsDescribeCloudOpsBatchOpsInfoResponse.RequestId"));
		opsDescribeCloudOpsBatchOpsInfoResponse.setBizMessage(_ctx.stringValue("OpsDescribeCloudOpsBatchOpsInfoResponse.BizMessage"));
		opsDescribeCloudOpsBatchOpsInfoResponse.setBizCode(_ctx.stringValue("OpsDescribeCloudOpsBatchOpsInfoResponse.BizCode"));

		Data data = new Data();

		BatchOpsInfoData batchOpsInfoData = new BatchOpsInfoData();
		batchOpsInfoData.setTotalCount(_ctx.integerValue("OpsDescribeCloudOpsBatchOpsInfoResponse.Data.BatchOpsInfoData.TotalCount"));

		List<BatchOpsInfo> batchOpsInfos = new ArrayList<BatchOpsInfo>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeCloudOpsBatchOpsInfoResponse.Data.BatchOpsInfoData.BatchOpsInfos.Length"); i++) {
			BatchOpsInfo batchOpsInfo = new BatchOpsInfo();
			batchOpsInfo.setStatus(_ctx.stringValue("OpsDescribeCloudOpsBatchOpsInfoResponse.Data.BatchOpsInfoData.BatchOpsInfos["+ i +"].Status"));
			batchOpsInfo.setPhysicalModel(_ctx.stringValue("OpsDescribeCloudOpsBatchOpsInfoResponse.Data.BatchOpsInfoData.BatchOpsInfos["+ i +"].PhysicalModel"));
			batchOpsInfo.setExtendData(_ctx.stringValue("OpsDescribeCloudOpsBatchOpsInfoResponse.Data.BatchOpsInfoData.BatchOpsInfos["+ i +"].ExtendData"));
			batchOpsInfo.setRoom(_ctx.stringValue("OpsDescribeCloudOpsBatchOpsInfoResponse.Data.BatchOpsInfoData.BatchOpsInfos["+ i +"].Room"));
			batchOpsInfo.setCluster(_ctx.stringValue("OpsDescribeCloudOpsBatchOpsInfoResponse.Data.BatchOpsInfoData.BatchOpsInfos["+ i +"].Cluster"));
			batchOpsInfo.setPlanTime(_ctx.stringValue("OpsDescribeCloudOpsBatchOpsInfoResponse.Data.BatchOpsInfoData.BatchOpsInfos["+ i +"].PlanTime"));
			batchOpsInfo.setRemark(_ctx.stringValue("OpsDescribeCloudOpsBatchOpsInfoResponse.Data.BatchOpsInfoData.BatchOpsInfos["+ i +"].Remark"));
			batchOpsInfo.setWeightLevel(_ctx.integerValue("OpsDescribeCloudOpsBatchOpsInfoResponse.Data.BatchOpsInfoData.BatchOpsInfos["+ i +"].WeightLevel"));
			batchOpsInfo.setSubmitUser(_ctx.stringValue("OpsDescribeCloudOpsBatchOpsInfoResponse.Data.BatchOpsInfoData.BatchOpsInfos["+ i +"].SubmitUser"));
			batchOpsInfo.setProblemId(_ctx.stringValue("OpsDescribeCloudOpsBatchOpsInfoResponse.Data.BatchOpsInfoData.BatchOpsInfos["+ i +"].ProblemId"));
			batchOpsInfo.setGmtModified(_ctx.stringValue("OpsDescribeCloudOpsBatchOpsInfoResponse.Data.BatchOpsInfoData.BatchOpsInfos["+ i +"].GmtModified"));
			batchOpsInfo.setAzone(_ctx.stringValue("OpsDescribeCloudOpsBatchOpsInfoResponse.Data.BatchOpsInfoData.BatchOpsInfos["+ i +"].Azone"));
			batchOpsInfo.setOpsType(_ctx.stringValue("OpsDescribeCloudOpsBatchOpsInfoResponse.Data.BatchOpsInfoData.BatchOpsInfos["+ i +"].OpsType"));
			batchOpsInfo.setResourceType(_ctx.stringValue("OpsDescribeCloudOpsBatchOpsInfoResponse.Data.BatchOpsInfoData.BatchOpsInfos["+ i +"].ResourceType"));
			batchOpsInfo.setAswId(_ctx.stringValue("OpsDescribeCloudOpsBatchOpsInfoResponse.Data.BatchOpsInfoData.BatchOpsInfos["+ i +"].AswId"));
			batchOpsInfo.setRack(_ctx.stringValue("OpsDescribeCloudOpsBatchOpsInfoResponse.Data.BatchOpsInfoData.BatchOpsInfos["+ i +"].Rack"));
			batchOpsInfo.setRegion(_ctx.stringValue("OpsDescribeCloudOpsBatchOpsInfoResponse.Data.BatchOpsInfoData.BatchOpsInfos["+ i +"].Region"));
			batchOpsInfo.setGmtCreate(_ctx.stringValue("OpsDescribeCloudOpsBatchOpsInfoResponse.Data.BatchOpsInfoData.BatchOpsInfos["+ i +"].GmtCreate"));
			batchOpsInfo.setIdc(_ctx.stringValue("OpsDescribeCloudOpsBatchOpsInfoResponse.Data.BatchOpsInfoData.BatchOpsInfos["+ i +"].Idc"));
			batchOpsInfo.setResourceId(_ctx.stringValue("OpsDescribeCloudOpsBatchOpsInfoResponse.Data.BatchOpsInfoData.BatchOpsInfos["+ i +"].ResourceId"));
			batchOpsInfo.setTaskId(_ctx.integerValue("OpsDescribeCloudOpsBatchOpsInfoResponse.Data.BatchOpsInfoData.BatchOpsInfos["+ i +"].TaskId"));
			batchOpsInfo.setId(_ctx.integerValue("OpsDescribeCloudOpsBatchOpsInfoResponse.Data.BatchOpsInfoData.BatchOpsInfos["+ i +"].Id"));

			batchOpsInfos.add(batchOpsInfo);
		}
		batchOpsInfoData.setBatchOpsInfos(batchOpsInfos);
		data.setBatchOpsInfoData(batchOpsInfoData);

		BatchOpsTaskData batchOpsTaskData = new BatchOpsTaskData();
		batchOpsTaskData.setStatus(_ctx.stringValue("OpsDescribeCloudOpsBatchOpsInfoResponse.Data.BatchOpsTaskData.Status"));
		batchOpsTaskData.setPhysicalModel(_ctx.stringValue("OpsDescribeCloudOpsBatchOpsInfoResponse.Data.BatchOpsTaskData.PhysicalModel"));
		batchOpsTaskData.setExtendData(_ctx.stringValue("OpsDescribeCloudOpsBatchOpsInfoResponse.Data.BatchOpsTaskData.ExtendData"));
		batchOpsTaskData.setRoom(_ctx.stringValue("OpsDescribeCloudOpsBatchOpsInfoResponse.Data.BatchOpsTaskData.Room"));
		batchOpsTaskData.setCluster(_ctx.stringValue("OpsDescribeCloudOpsBatchOpsInfoResponse.Data.BatchOpsTaskData.Cluster"));
		batchOpsTaskData.setSubmitUser(_ctx.stringValue("OpsDescribeCloudOpsBatchOpsInfoResponse.Data.BatchOpsTaskData.SubmitUser"));
		batchOpsTaskData.setProblemId(_ctx.stringValue("OpsDescribeCloudOpsBatchOpsInfoResponse.Data.BatchOpsTaskData.ProblemId"));
		batchOpsTaskData.setGmtModified(_ctx.stringValue("OpsDescribeCloudOpsBatchOpsInfoResponse.Data.BatchOpsTaskData.GmtModified"));
		batchOpsTaskData.setSource(_ctx.stringValue("OpsDescribeCloudOpsBatchOpsInfoResponse.Data.BatchOpsTaskData.Source"));
		batchOpsTaskData.setAzone(_ctx.stringValue("OpsDescribeCloudOpsBatchOpsInfoResponse.Data.BatchOpsTaskData.Azone"));
		batchOpsTaskData.setOpsType(_ctx.stringValue("OpsDescribeCloudOpsBatchOpsInfoResponse.Data.BatchOpsTaskData.OpsType"));
		batchOpsTaskData.setResourceType(_ctx.stringValue("OpsDescribeCloudOpsBatchOpsInfoResponse.Data.BatchOpsTaskData.ResourceType"));
		batchOpsTaskData.setAswId(_ctx.stringValue("OpsDescribeCloudOpsBatchOpsInfoResponse.Data.BatchOpsTaskData.AswId"));
		batchOpsTaskData.setRack(_ctx.stringValue("OpsDescribeCloudOpsBatchOpsInfoResponse.Data.BatchOpsTaskData.Rack"));
		batchOpsTaskData.setRegion(_ctx.stringValue("OpsDescribeCloudOpsBatchOpsInfoResponse.Data.BatchOpsTaskData.Region"));
		batchOpsTaskData.setGmtCreate(_ctx.stringValue("OpsDescribeCloudOpsBatchOpsInfoResponse.Data.BatchOpsTaskData.GmtCreate"));
		batchOpsTaskData.setTitle(_ctx.stringValue("OpsDescribeCloudOpsBatchOpsInfoResponse.Data.BatchOpsTaskData.Title"));
		batchOpsTaskData.setSupportedFamily(_ctx.stringValue("OpsDescribeCloudOpsBatchOpsInfoResponse.Data.BatchOpsTaskData.SupportedFamily"));
		batchOpsTaskData.setIdc(_ctx.stringValue("OpsDescribeCloudOpsBatchOpsInfoResponse.Data.BatchOpsTaskData.Idc"));
		batchOpsTaskData.setResourceId(_ctx.stringValue("OpsDescribeCloudOpsBatchOpsInfoResponse.Data.BatchOpsTaskData.ResourceId"));
		batchOpsTaskData.setId(_ctx.integerValue("OpsDescribeCloudOpsBatchOpsInfoResponse.Data.BatchOpsTaskData.Id"));
		data.setBatchOpsTaskData(batchOpsTaskData);
		opsDescribeCloudOpsBatchOpsInfoResponse.setData(data);
	 
	 	return opsDescribeCloudOpsBatchOpsInfoResponse;
	}
}