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

import com.aliyuncs.ecsops.model.v20160401.OpsQueryVmFailureOverviewResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryVmFailureOverviewResponse.OverviewInfoItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQueryVmFailureOverviewResponseUnmarshaller {

	public static OpsQueryVmFailureOverviewResponse unmarshall(OpsQueryVmFailureOverviewResponse opsQueryVmFailureOverviewResponse, UnmarshallerContext _ctx) {
		
		opsQueryVmFailureOverviewResponse.setRequestId(_ctx.stringValue("OpsQueryVmFailureOverviewResponse.RequestId"));
		opsQueryVmFailureOverviewResponse.setStartTime(_ctx.stringValue("OpsQueryVmFailureOverviewResponse.StartTime"));
		opsQueryVmFailureOverviewResponse.setEndTime(_ctx.stringValue("OpsQueryVmFailureOverviewResponse.EndTime"));
		opsQueryVmFailureOverviewResponse.setQueryGroupField(_ctx.stringValue("OpsQueryVmFailureOverviewResponse.QueryGroupField"));

		List<String> groupFieldValues = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryVmFailureOverviewResponse.GroupFieldValues.Length"); i++) {
			groupFieldValues.add(_ctx.stringValue("OpsQueryVmFailureOverviewResponse.GroupFieldValues["+ i +"]"));
		}
		opsQueryVmFailureOverviewResponse.setGroupFieldValues(groupFieldValues);

		List<OverviewInfoItem> overviewInfoList = new ArrayList<OverviewInfoItem>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryVmFailureOverviewResponse.OverviewInfoList.Length"); i++) {
			OverviewInfoItem overviewInfoItem = new OverviewInfoItem();
			overviewInfoItem.setGocExceptionName(_ctx.stringValue("OpsQueryVmFailureOverviewResponse.OverviewInfoList["+ i +"].GocExceptionName"));
			overviewInfoItem.setVcpuCnt(_ctx.integerValue("OpsQueryVmFailureOverviewResponse.OverviewInfoList["+ i +"].VcpuCnt"));
			overviewInfoItem.setGocVcpuCnt(_ctx.floatValue("OpsQueryVmFailureOverviewResponse.OverviewInfoList["+ i +"].GocVcpuCnt"));
			overviewInfoItem.setNcCnt(_ctx.integerValue("OpsQueryVmFailureOverviewResponse.OverviewInfoList["+ i +"].NcCnt"));
			overviewInfoItem.setVmCnt(_ctx.integerValue("OpsQueryVmFailureOverviewResponse.OverviewInfoList["+ i +"].VmCnt"));
			overviewInfoItem.setUserCnt(_ctx.integerValue("OpsQueryVmFailureOverviewResponse.OverviewInfoList["+ i +"].UserCnt"));
			overviewInfoItem.setGc6Cnt(_ctx.integerValue("OpsQueryVmFailureOverviewResponse.OverviewInfoList["+ i +"].Gc6Cnt"));
			overviewInfoItem.setGc7Cnt(_ctx.integerValue("OpsQueryVmFailureOverviewResponse.OverviewInfoList["+ i +"].Gc7Cnt"));
			overviewInfoItem.setRecoverNcCnt(_ctx.integerValue("OpsQueryVmFailureOverviewResponse.OverviewInfoList["+ i +"].RecoverNcCnt"));
			overviewInfoItem.setUnrecoverNcCnt(_ctx.integerValue("OpsQueryVmFailureOverviewResponse.OverviewInfoList["+ i +"].UnrecoverNcCnt"));
			overviewInfoItem.setRecoverVmCnt(_ctx.integerValue("OpsQueryVmFailureOverviewResponse.OverviewInfoList["+ i +"].RecoverVmCnt"));
			overviewInfoItem.setUnrecoverVmCnt(_ctx.integerValue("OpsQueryVmFailureOverviewResponse.OverviewInfoList["+ i +"].UnrecoverVmCnt"));
			overviewInfoItem.setRecoverVcpuCnt(_ctx.integerValue("OpsQueryVmFailureOverviewResponse.OverviewInfoList["+ i +"].RecoverVcpuCnt"));
			overviewInfoItem.setUnrecoverVCpuCnt(_ctx.integerValue("OpsQueryVmFailureOverviewResponse.OverviewInfoList["+ i +"].UnrecoverVCpuCnt"));
			overviewInfoItem.setSequentialRecoverVmCnt(_ctx.integerValue("OpsQueryVmFailureOverviewResponse.OverviewInfoList["+ i +"].SequentialRecoverVmCnt"));
			overviewInfoItem.setSequentialUnRecoverVmCnt(_ctx.integerValue("OpsQueryVmFailureOverviewResponse.OverviewInfoList["+ i +"].SequentialUnRecoverVmCnt"));
			overviewInfoItem.setSequentialRecoverVcpuCnt(_ctx.integerValue("OpsQueryVmFailureOverviewResponse.OverviewInfoList["+ i +"].SequentialRecoverVcpuCnt"));
			overviewInfoItem.setSequentialUnRecoverVcpuCnt(_ctx.integerValue("OpsQueryVmFailureOverviewResponse.OverviewInfoList["+ i +"].SequentialUnRecoverVcpuCnt"));

			overviewInfoList.add(overviewInfoItem);
		}
		opsQueryVmFailureOverviewResponse.setOverviewInfoList(overviewInfoList);
	 
	 	return opsQueryVmFailureOverviewResponse;
	}
}