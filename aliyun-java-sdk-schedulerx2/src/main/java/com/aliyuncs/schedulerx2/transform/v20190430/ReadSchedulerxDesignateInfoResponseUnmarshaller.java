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

import com.aliyuncs.schedulerx2.model.v20190430.ReadSchedulerxDesignateInfoResponse;
import com.aliyuncs.schedulerx2.model.v20190430.ReadSchedulerxDesignateInfoResponse.AccessDeniedDetail;
import com.aliyuncs.schedulerx2.model.v20190430.ReadSchedulerxDesignateInfoResponse.Data;
import com.aliyuncs.schedulerx2.model.v20190430.ReadSchedulerxDesignateInfoResponse.Data.DesignateDetailVo;
import com.aliyuncs.schedulerx2.model.v20190430.ReadSchedulerxDesignateInfoResponse.Data.DesignateDetailVo.Metrics;
import com.aliyuncs.transform.UnmarshallerContext;


public class ReadSchedulerxDesignateInfoResponseUnmarshaller {

	public static ReadSchedulerxDesignateInfoResponse unmarshall(ReadSchedulerxDesignateInfoResponse readSchedulerxDesignateInfoResponse, UnmarshallerContext _ctx) {
		
		readSchedulerxDesignateInfoResponse.setRequestId(_ctx.stringValue("ReadSchedulerxDesignateInfoResponse.RequestId"));
		readSchedulerxDesignateInfoResponse.setCode(_ctx.integerValue("ReadSchedulerxDesignateInfoResponse.Code"));
		readSchedulerxDesignateInfoResponse.setMessage(_ctx.stringValue("ReadSchedulerxDesignateInfoResponse.Message"));
		readSchedulerxDesignateInfoResponse.setSuccess(_ctx.booleanValue("ReadSchedulerxDesignateInfoResponse.Success"));

		Data data = new Data();
		data.setDesignateType(_ctx.integerValue("ReadSchedulerxDesignateInfoResponse.Data.DesignateType"));
		data.setTransferable(_ctx.booleanValue("ReadSchedulerxDesignateInfoResponse.Data.Transferable"));

		List<DesignateDetailVo> designateDetailVos = new ArrayList<DesignateDetailVo>();
		for (int i = 0; i < _ctx.lengthValue("ReadSchedulerxDesignateInfoResponse.Data.DesignateDetailVos.Length"); i++) {
			DesignateDetailVo designateDetailVo = new DesignateDetailVo();
			designateDetailVo.setChecked(_ctx.booleanValue("ReadSchedulerxDesignateInfoResponse.Data.DesignateDetailVos["+ i +"].Checked"));
			designateDetailVo.setVersion(_ctx.stringValue("ReadSchedulerxDesignateInfoResponse.Data.DesignateDetailVos["+ i +"].Version"));
			designateDetailVo.setSize(_ctx.integerValue("ReadSchedulerxDesignateInfoResponse.Data.DesignateDetailVos["+ i +"].Size"));
			designateDetailVo.setBusy(_ctx.stringValue("ReadSchedulerxDesignateInfoResponse.Data.DesignateDetailVos["+ i +"].Busy"));
			designateDetailVo.setOffline(_ctx.booleanValue("ReadSchedulerxDesignateInfoResponse.Data.DesignateDetailVos["+ i +"].Offline"));
			designateDetailVo.setStarter(_ctx.stringValue("ReadSchedulerxDesignateInfoResponse.Data.DesignateDetailVos["+ i +"].Starter"));
			designateDetailVo.setKey(_ctx.stringValue("ReadSchedulerxDesignateInfoResponse.Data.DesignateDetailVos["+ i +"].Key"));

			Metrics metrics = new Metrics();
			metrics.setSharePoolAvailableSize(_ctx.integerValue("ReadSchedulerxDesignateInfoResponse.Data.DesignateDetailVos["+ i +"].Metrics.SharePoolAvailableSize"));
			metrics.setHeap1Usage(_ctx.doubleValue("ReadSchedulerxDesignateInfoResponse.Data.DesignateDetailVos["+ i +"].Metrics.Heap1Usage"));
			metrics.setDiskUsage(_ctx.doubleValue("ReadSchedulerxDesignateInfoResponse.Data.DesignateDetailVos["+ i +"].Metrics.DiskUsage"));
			metrics.setCpuProcessors(_ctx.integerValue("ReadSchedulerxDesignateInfoResponse.Data.DesignateDetailVos["+ i +"].Metrics.CpuProcessors"));
			metrics.setHeap1Used(_ctx.doubleValue("ReadSchedulerxDesignateInfoResponse.Data.DesignateDetailVos["+ i +"].Metrics.Heap1Used"));
			metrics.setCpuLoad1(_ctx.doubleValue("ReadSchedulerxDesignateInfoResponse.Data.DesignateDetailVos["+ i +"].Metrics.CpuLoad1"));
			metrics.setCpuLoad5(_ctx.doubleValue("ReadSchedulerxDesignateInfoResponse.Data.DesignateDetailVos["+ i +"].Metrics.CpuLoad5"));
			metrics.setExecCount(_ctx.longValue("ReadSchedulerxDesignateInfoResponse.Data.DesignateDetailVos["+ i +"].Metrics.ExecCount"));
			metrics.setSharePoolQueueSize(_ctx.integerValue("ReadSchedulerxDesignateInfoResponse.Data.DesignateDetailVos["+ i +"].Metrics.SharePoolQueueSize"));
			metrics.setHeapMax(_ctx.integerValue("ReadSchedulerxDesignateInfoResponse.Data.DesignateDetailVos["+ i +"].Metrics.HeapMax"));
			metrics.setDiskUsed(_ctx.integerValue("ReadSchedulerxDesignateInfoResponse.Data.DesignateDetailVos["+ i +"].Metrics.DiskUsed"));
			metrics.setDiskMax(_ctx.integerValue("ReadSchedulerxDesignateInfoResponse.Data.DesignateDetailVos["+ i +"].Metrics.DiskMax"));
			metrics.setHeap5Usage(_ctx.doubleValue("ReadSchedulerxDesignateInfoResponse.Data.DesignateDetailVos["+ i +"].Metrics.Heap5Usage"));
			designateDetailVo.setMetrics(metrics);

			designateDetailVos.add(designateDetailVo);
		}
		data.setDesignateDetailVos(designateDetailVos);
		readSchedulerxDesignateInfoResponse.setData(data);

		AccessDeniedDetail accessDeniedDetail = new AccessDeniedDetail();
		accessDeniedDetail.setAuthAction(_ctx.stringValue("ReadSchedulerxDesignateInfoResponse.AccessDeniedDetail.AuthAction"));
		accessDeniedDetail.setAuthPrincipalDisplayName(_ctx.stringValue("ReadSchedulerxDesignateInfoResponse.AccessDeniedDetail.AuthPrincipalDisplayName"));
		accessDeniedDetail.setAuthPrincipalOwnerId(_ctx.stringValue("ReadSchedulerxDesignateInfoResponse.AccessDeniedDetail.AuthPrincipalOwnerId"));
		accessDeniedDetail.setAuthPrincipalType(_ctx.stringValue("ReadSchedulerxDesignateInfoResponse.AccessDeniedDetail.AuthPrincipalType"));
		accessDeniedDetail.setEncodedDiagnosticMessage(_ctx.stringValue("ReadSchedulerxDesignateInfoResponse.AccessDeniedDetail.EncodedDiagnosticMessage"));
		accessDeniedDetail.setNoPermissionType(_ctx.stringValue("ReadSchedulerxDesignateInfoResponse.AccessDeniedDetail.NoPermissionType"));
		accessDeniedDetail.setPolicyType(_ctx.stringValue("ReadSchedulerxDesignateInfoResponse.AccessDeniedDetail.PolicyType"));
		readSchedulerxDesignateInfoResponse.setAccessDeniedDetail(accessDeniedDetail);
	 
	 	return readSchedulerxDesignateInfoResponse;
	}
}