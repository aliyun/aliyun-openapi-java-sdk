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

package com.aliyuncs.schedulerx2.transform.v20190430;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.schedulerx2.model.v20190430.ReadSchedulerxDesignateDetailResponse;
import com.aliyuncs.schedulerx2.model.v20190430.ReadSchedulerxDesignateDetailResponse.AccessDeniedDetail;
import com.aliyuncs.schedulerx2.model.v20190430.ReadSchedulerxDesignateDetailResponse.Data;
import com.aliyuncs.schedulerx2.model.v20190430.ReadSchedulerxDesignateDetailResponse.Data.DesignateDetailVo;
import com.aliyuncs.schedulerx2.model.v20190430.ReadSchedulerxDesignateDetailResponse.Data.DesignateDetailVo.Metrics;
import com.aliyuncs.transform.UnmarshallerContext;


public class ReadSchedulerxDesignateDetailResponseUnmarshaller {

	public static ReadSchedulerxDesignateDetailResponse unmarshall(ReadSchedulerxDesignateDetailResponse readSchedulerxDesignateDetailResponse, UnmarshallerContext _ctx) {
		
		readSchedulerxDesignateDetailResponse.setRequestId(_ctx.stringValue("ReadSchedulerxDesignateDetailResponse.RequestId"));
		readSchedulerxDesignateDetailResponse.setCode(_ctx.integerValue("ReadSchedulerxDesignateDetailResponse.Code"));
		readSchedulerxDesignateDetailResponse.setMessage(_ctx.stringValue("ReadSchedulerxDesignateDetailResponse.Message"));
		readSchedulerxDesignateDetailResponse.setSuccess(_ctx.booleanValue("ReadSchedulerxDesignateDetailResponse.Success"));

		Data data = new Data();

		List<DesignateDetailVo> designateDetailVos = new ArrayList<DesignateDetailVo>();
		for (int i = 0; i < _ctx.lengthValue("ReadSchedulerxDesignateDetailResponse.Data.DesignateDetailVos.Length"); i++) {
			DesignateDetailVo designateDetailVo = new DesignateDetailVo();
			designateDetailVo.setOffline(_ctx.booleanValue("ReadSchedulerxDesignateDetailResponse.Data.DesignateDetailVos["+ i +"].Offline"));
			designateDetailVo.setSize(_ctx.integerValue("ReadSchedulerxDesignateDetailResponse.Data.DesignateDetailVos["+ i +"].Size"));
			designateDetailVo.setStarter(_ctx.stringValue("ReadSchedulerxDesignateDetailResponse.Data.DesignateDetailVos["+ i +"].Starter"));
			designateDetailVo.setBusy(_ctx.stringValue("ReadSchedulerxDesignateDetailResponse.Data.DesignateDetailVos["+ i +"].Busy"));
			designateDetailVo.setChecked(_ctx.booleanValue("ReadSchedulerxDesignateDetailResponse.Data.DesignateDetailVos["+ i +"].Checked"));
			designateDetailVo.setVersion(_ctx.stringValue("ReadSchedulerxDesignateDetailResponse.Data.DesignateDetailVos["+ i +"].Version"));
			designateDetailVo.setKey(_ctx.stringValue("ReadSchedulerxDesignateDetailResponse.Data.DesignateDetailVos["+ i +"].Key"));

			Metrics metrics = new Metrics();
			metrics.setCpuLoad1(_ctx.doubleValue("ReadSchedulerxDesignateDetailResponse.Data.DesignateDetailVos["+ i +"].Metrics.CpuLoad1"));
			metrics.setCpuLoad5(_ctx.doubleValue("ReadSchedulerxDesignateDetailResponse.Data.DesignateDetailVos["+ i +"].Metrics.CpuLoad5"));
			metrics.setCpuProcessors(_ctx.integerValue("ReadSchedulerxDesignateDetailResponse.Data.DesignateDetailVos["+ i +"].Metrics.CpuProcessors"));
			metrics.setHeap1Usage(_ctx.doubleValue("ReadSchedulerxDesignateDetailResponse.Data.DesignateDetailVos["+ i +"].Metrics.Heap1Usage"));
			metrics.setHeap5Usage(_ctx.doubleValue("ReadSchedulerxDesignateDetailResponse.Data.DesignateDetailVos["+ i +"].Metrics.Heap5Usage"));
			metrics.setHeap1Used(_ctx.doubleValue("ReadSchedulerxDesignateDetailResponse.Data.DesignateDetailVos["+ i +"].Metrics.Heap1Used"));
			metrics.setHeapMax(_ctx.integerValue("ReadSchedulerxDesignateDetailResponse.Data.DesignateDetailVos["+ i +"].Metrics.HeapMax"));
			metrics.setDiskUsage(_ctx.doubleValue("ReadSchedulerxDesignateDetailResponse.Data.DesignateDetailVos["+ i +"].Metrics.DiskUsage"));
			metrics.setDiskUsed(_ctx.integerValue("ReadSchedulerxDesignateDetailResponse.Data.DesignateDetailVos["+ i +"].Metrics.DiskUsed"));
			metrics.setDiskMax(_ctx.integerValue("ReadSchedulerxDesignateDetailResponse.Data.DesignateDetailVos["+ i +"].Metrics.DiskMax"));
			metrics.setSharePoolQueueSize(_ctx.integerValue("ReadSchedulerxDesignateDetailResponse.Data.DesignateDetailVos["+ i +"].Metrics.SharePoolQueueSize"));
			metrics.setSharePoolAvailableSize(_ctx.integerValue("ReadSchedulerxDesignateDetailResponse.Data.DesignateDetailVos["+ i +"].Metrics.SharePoolAvailableSize"));
			metrics.setExecCount(_ctx.longValue("ReadSchedulerxDesignateDetailResponse.Data.DesignateDetailVos["+ i +"].Metrics.ExecCount"));
			designateDetailVo.setMetrics(metrics);

			designateDetailVos.add(designateDetailVo);
		}
		data.setDesignateDetailVos(designateDetailVos);
		readSchedulerxDesignateDetailResponse.setData(data);

		AccessDeniedDetail accessDeniedDetail = new AccessDeniedDetail();
		accessDeniedDetail.setAuthAction(_ctx.stringValue("ReadSchedulerxDesignateDetailResponse.AccessDeniedDetail.AuthAction"));
		accessDeniedDetail.setAuthPrincipalDisplayName(_ctx.stringValue("ReadSchedulerxDesignateDetailResponse.AccessDeniedDetail.AuthPrincipalDisplayName"));
		accessDeniedDetail.setAuthPrincipalOwnerId(_ctx.stringValue("ReadSchedulerxDesignateDetailResponse.AccessDeniedDetail.AuthPrincipalOwnerId"));
		accessDeniedDetail.setAuthPrincipalType(_ctx.stringValue("ReadSchedulerxDesignateDetailResponse.AccessDeniedDetail.AuthPrincipalType"));
		accessDeniedDetail.setEncodedDiagnosticMessage(_ctx.stringValue("ReadSchedulerxDesignateDetailResponse.AccessDeniedDetail.EncodedDiagnosticMessage"));
		accessDeniedDetail.setNoPermissionType(_ctx.stringValue("ReadSchedulerxDesignateDetailResponse.AccessDeniedDetail.NoPermissionType"));
		accessDeniedDetail.setPolicyType(_ctx.stringValue("ReadSchedulerxDesignateDetailResponse.AccessDeniedDetail.PolicyType"));
		readSchedulerxDesignateDetailResponse.setAccessDeniedDetail(accessDeniedDetail);
	 
	 	return readSchedulerxDesignateDetailResponse;
	}
}