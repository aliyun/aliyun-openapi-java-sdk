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
		opsQueryVmFailureOverviewResponse.setEndTime(_ctx.stringValue("OpsQueryVmFailureOverviewResponse.EndTime"));
		opsQueryVmFailureOverviewResponse.setStartTime(_ctx.stringValue("OpsQueryVmFailureOverviewResponse.StartTime"));
		opsQueryVmFailureOverviewResponse.setQueryGroupField(_ctx.stringValue("OpsQueryVmFailureOverviewResponse.QueryGroupField"));

		List<String> groupFieldValues = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryVmFailureOverviewResponse.GroupFieldValues.Length"); i++) {
			groupFieldValues.add(_ctx.stringValue("OpsQueryVmFailureOverviewResponse.GroupFieldValues["+ i +"]"));
		}
		opsQueryVmFailureOverviewResponse.setGroupFieldValues(groupFieldValues);

		List<OverviewInfoItem> overviewInfoList = new ArrayList<OverviewInfoItem>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryVmFailureOverviewResponse.OverviewInfoList.Length"); i++) {
			OverviewInfoItem overviewInfoItem = new OverviewInfoItem();
			overviewInfoItem.setRecoverVcpuCnt(_ctx.integerValue("OpsQueryVmFailureOverviewResponse.OverviewInfoList["+ i +"].RecoverVcpuCnt"));
			overviewInfoItem.setSequentialUnRecoverVmCnt(_ctx.integerValue("OpsQueryVmFailureOverviewResponse.OverviewInfoList["+ i +"].SequentialUnRecoverVmCnt"));
			overviewInfoItem.setRecoverVmCnt(_ctx.integerValue("OpsQueryVmFailureOverviewResponse.OverviewInfoList["+ i +"].RecoverVmCnt"));
			overviewInfoItem.setGocExceptionName(_ctx.stringValue("OpsQueryVmFailureOverviewResponse.OverviewInfoList["+ i +"].GocExceptionName"));
			overviewInfoItem.setNcCnt(_ctx.integerValue("OpsQueryVmFailureOverviewResponse.OverviewInfoList["+ i +"].NcCnt"));
			overviewInfoItem.setVcpuCnt(_ctx.integerValue("OpsQueryVmFailureOverviewResponse.OverviewInfoList["+ i +"].VcpuCnt"));
			overviewInfoItem.setUnrecoverVmCnt(_ctx.integerValue("OpsQueryVmFailureOverviewResponse.OverviewInfoList["+ i +"].UnrecoverVmCnt"));
			overviewInfoItem.setUserCnt(_ctx.integerValue("OpsQueryVmFailureOverviewResponse.OverviewInfoList["+ i +"].UserCnt"));
			overviewInfoItem.setUnrecoverNcCnt(_ctx.integerValue("OpsQueryVmFailureOverviewResponse.OverviewInfoList["+ i +"].UnrecoverNcCnt"));
			overviewInfoItem.setGc7Cnt(_ctx.integerValue("OpsQueryVmFailureOverviewResponse.OverviewInfoList["+ i +"].Gc7Cnt"));
			overviewInfoItem.setSequentialUnRecoverVcpuCnt(_ctx.integerValue("OpsQueryVmFailureOverviewResponse.OverviewInfoList["+ i +"].SequentialUnRecoverVcpuCnt"));
			overviewInfoItem.setUnrecoverVCpuCnt(_ctx.integerValue("OpsQueryVmFailureOverviewResponse.OverviewInfoList["+ i +"].UnrecoverVCpuCnt"));
			overviewInfoItem.setRecoverNcCnt(_ctx.integerValue("OpsQueryVmFailureOverviewResponse.OverviewInfoList["+ i +"].RecoverNcCnt"));
			overviewInfoItem.setGc6Cnt(_ctx.integerValue("OpsQueryVmFailureOverviewResponse.OverviewInfoList["+ i +"].Gc6Cnt"));
			overviewInfoItem.setVmCnt(_ctx.integerValue("OpsQueryVmFailureOverviewResponse.OverviewInfoList["+ i +"].VmCnt"));
			overviewInfoItem.setSequentialRecoverVmCnt(_ctx.integerValue("OpsQueryVmFailureOverviewResponse.OverviewInfoList["+ i +"].SequentialRecoverVmCnt"));
			overviewInfoItem.setGocVcpuCnt(_ctx.floatValue("OpsQueryVmFailureOverviewResponse.OverviewInfoList["+ i +"].GocVcpuCnt"));
			overviewInfoItem.setSequentialRecoverVcpuCnt(_ctx.integerValue("OpsQueryVmFailureOverviewResponse.OverviewInfoList["+ i +"].SequentialRecoverVcpuCnt"));
			overviewInfoItem.setAliProductVmCnt(_ctx.integerValue("OpsQueryVmFailureOverviewResponse.OverviewInfoList["+ i +"].AliProductVmCnt"));
			overviewInfoItem.setVmUniqueCnt(_ctx.integerValue("OpsQueryVmFailureOverviewResponse.OverviewInfoList["+ i +"].VmUniqueCnt"));
			overviewInfoItem.setUnRecoverVmUniqueCnt(_ctx.integerValue("OpsQueryVmFailureOverviewResponse.OverviewInfoList["+ i +"].UnRecoverVmUniqueCnt"));
			overviewInfoItem.setSequentialUnRecoverVmUniqueCnt(_ctx.integerValue("OpsQueryVmFailureOverviewResponse.OverviewInfoList["+ i +"].SequentialUnRecoverVmUniqueCnt"));

			overviewInfoList.add(overviewInfoItem);
		}
		opsQueryVmFailureOverviewResponse.setOverviewInfoList(overviewInfoList);
	 
	 	return opsQueryVmFailureOverviewResponse;
	}
}