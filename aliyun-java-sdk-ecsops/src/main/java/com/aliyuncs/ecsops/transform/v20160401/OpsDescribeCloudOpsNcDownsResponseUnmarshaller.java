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

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeCloudOpsNcDownsResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeCloudOpsNcDownsResponse.NcDownInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeCloudOpsNcDownsResponseUnmarshaller {

	public static OpsDescribeCloudOpsNcDownsResponse unmarshall(OpsDescribeCloudOpsNcDownsResponse opsDescribeCloudOpsNcDownsResponse, UnmarshallerContext _ctx) {
		
		opsDescribeCloudOpsNcDownsResponse.setRequestId(_ctx.stringValue("OpsDescribeCloudOpsNcDownsResponse.RequestId"));
		opsDescribeCloudOpsNcDownsResponse.setBizCode(_ctx.stringValue("OpsDescribeCloudOpsNcDownsResponse.BizCode"));
		opsDescribeCloudOpsNcDownsResponse.setBizMessage(_ctx.stringValue("OpsDescribeCloudOpsNcDownsResponse.BizMessage"));
		opsDescribeCloudOpsNcDownsResponse.setCount(_ctx.integerValue("OpsDescribeCloudOpsNcDownsResponse.Count"));
		opsDescribeCloudOpsNcDownsResponse.setPage(_ctx.integerValue("OpsDescribeCloudOpsNcDownsResponse.Page"));
		opsDescribeCloudOpsNcDownsResponse.setPageSize(_ctx.integerValue("OpsDescribeCloudOpsNcDownsResponse.PageSize"));
		opsDescribeCloudOpsNcDownsResponse.setTotalCount(_ctx.integerValue("OpsDescribeCloudOpsNcDownsResponse.TotalCount"));

		List<NcDownInfo> data = new ArrayList<NcDownInfo>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeCloudOpsNcDownsResponse.Data.Length"); i++) {
			NcDownInfo ncDownInfo = new NcDownInfo();
			ncDownInfo.setAggrDownType(_ctx.stringValue("OpsDescribeCloudOpsNcDownsResponse.Data["+ i +"].AggrDownType"));
			ncDownInfo.setCluster(_ctx.stringValue("OpsDescribeCloudOpsNcDownsResponse.Data["+ i +"].Cluster"));
			ncDownInfo.setClusterUsage(_ctx.stringValue("OpsDescribeCloudOpsNcDownsResponse.Data["+ i +"].ClusterUsage"));
			ncDownInfo.setCreate(_ctx.stringValue("OpsDescribeCloudOpsNcDownsResponse.Data["+ i +"].Create"));
			ncDownInfo.setDownId(_ctx.stringValue("OpsDescribeCloudOpsNcDownsResponse.Data["+ i +"].DownId"));
			ncDownInfo.setHeader(_ctx.stringValue("OpsDescribeCloudOpsNcDownsResponse.Data["+ i +"].Header"));
			ncDownInfo.setHitch(_ctx.integerValue("OpsDescribeCloudOpsNcDownsResponse.Data["+ i +"].Hitch"));
			ncDownInfo.setHostname(_ctx.stringValue("OpsDescribeCloudOpsNcDownsResponse.Data["+ i +"].Hostname"));
			ncDownInfo.setId(_ctx.longValue("OpsDescribeCloudOpsNcDownsResponse.Data["+ i +"].Id"));
			ncDownInfo.setIp(_ctx.stringValue("OpsDescribeCloudOpsNcDownsResponse.Data["+ i +"].Ip"));
			ncDownInfo.setKelude(_ctx.stringValue("OpsDescribeCloudOpsNcDownsResponse.Data["+ i +"].Kelude"));
			ncDownInfo.setManufacturer(_ctx.stringValue("OpsDescribeCloudOpsNcDownsResponse.Data["+ i +"].Manufacturer"));
			ncDownInfo.setNcId(_ctx.stringValue("OpsDescribeCloudOpsNcDownsResponse.Data["+ i +"].NcId"));
			ncDownInfo.setNcType(_ctx.stringValue("OpsDescribeCloudOpsNcDownsResponse.Data["+ i +"].NcType"));
			ncDownInfo.setOpsType(_ctx.stringValue("OpsDescribeCloudOpsNcDownsResponse.Data["+ i +"].OpsType"));
			ncDownInfo.setReason(_ctx.stringValue("OpsDescribeCloudOpsNcDownsResponse.Data["+ i +"].Reason"));
			ncDownInfo.setRip(_ctx.stringValue("OpsDescribeCloudOpsNcDownsResponse.Data["+ i +"].Rip"));
			ncDownInfo.setType(_ctx.stringValue("OpsDescribeCloudOpsNcDownsResponse.Data["+ i +"].Type"));
			ncDownInfo.setVmInfo(_ctx.stringValue("OpsDescribeCloudOpsNcDownsResponse.Data["+ i +"].VmInfo"));

			data.add(ncDownInfo);
		}
		opsDescribeCloudOpsNcDownsResponse.setData(data);
	 
	 	return opsDescribeCloudOpsNcDownsResponse;
	}
}