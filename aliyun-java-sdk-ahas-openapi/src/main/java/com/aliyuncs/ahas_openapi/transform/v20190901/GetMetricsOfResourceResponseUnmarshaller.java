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

package com.aliyuncs.ahas_openapi.transform.v20190901;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ahas_openapi.model.v20190901.GetMetricsOfResourceResponse;
import com.aliyuncs.ahas_openapi.model.v20190901.GetMetricsOfResourceResponse.Data;
import com.aliyuncs.ahas_openapi.model.v20190901.GetMetricsOfResourceResponse.Data.InnerMetricsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMetricsOfResourceResponseUnmarshaller {

	public static GetMetricsOfResourceResponse unmarshall(GetMetricsOfResourceResponse getMetricsOfResourceResponse, UnmarshallerContext _ctx) {
		
		getMetricsOfResourceResponse.setRequestId(_ctx.stringValue("GetMetricsOfResourceResponse.RequestId"));
		getMetricsOfResourceResponse.setMessage(_ctx.stringValue("GetMetricsOfResourceResponse.Message"));
		getMetricsOfResourceResponse.setCode(_ctx.stringValue("GetMetricsOfResourceResponse.Code"));
		getMetricsOfResourceResponse.setSuccess(_ctx.booleanValue("GetMetricsOfResourceResponse.Success"));

		Data data = new Data();
		data.setAppName(_ctx.stringValue("GetMetricsOfResourceResponse.Data.AppName"));
		data.setResource(_ctx.stringValue("GetMetricsOfResourceResponse.Data.Resource"));
		data.setNamespace(_ctx.stringValue("GetMetricsOfResourceResponse.Data.Namespace"));

		List<InnerMetricsItem> innerMetrics = new ArrayList<InnerMetricsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetMetricsOfResourceResponse.Data.InnerMetrics.Length"); i++) {
			InnerMetricsItem innerMetricsItem = new InnerMetricsItem();
			innerMetricsItem.setRtP99(_ctx.floatValue("GetMetricsOfResourceResponse.Data.InnerMetrics["+ i +"].RtP99"));
			innerMetricsItem.setSuccessQpsAvg(_ctx.floatValue("GetMetricsOfResourceResponse.Data.InnerMetrics["+ i +"].SuccessQpsAvg"));
			innerMetricsItem.setPassedQpsP99(_ctx.floatValue("GetMetricsOfResourceResponse.Data.InnerMetrics["+ i +"].PassedQpsP99"));
			innerMetricsItem.setRtAvg(_ctx.floatValue("GetMetricsOfResourceResponse.Data.InnerMetrics["+ i +"].RtAvg"));
			innerMetricsItem.setCount(_ctx.integerValue("GetMetricsOfResourceResponse.Data.InnerMetrics["+ i +"].Count"));
			innerMetricsItem.setThreadStd(_ctx.floatValue("GetMetricsOfResourceResponse.Data.InnerMetrics["+ i +"].ThreadStd"));
			innerMetricsItem.setPassedQpsAvg(_ctx.floatValue("GetMetricsOfResourceResponse.Data.InnerMetrics["+ i +"].PassedQpsAvg"));
			innerMetricsItem.setExceptionP95(_ctx.floatValue("GetMetricsOfResourceResponse.Data.InnerMetrics["+ i +"].ExceptionP95"));
			innerMetricsItem.setSuccessQpsMax(_ctx.floatValue("GetMetricsOfResourceResponse.Data.InnerMetrics["+ i +"].SuccessQpsMax"));
			innerMetricsItem.setRtP95(_ctx.floatValue("GetMetricsOfResourceResponse.Data.InnerMetrics["+ i +"].RtP95"));
			innerMetricsItem.setBlockedQpsMin(_ctx.floatValue("GetMetricsOfResourceResponse.Data.InnerMetrics["+ i +"].BlockedQpsMin"));
			innerMetricsItem.setBlockedQps(_ctx.floatValue("GetMetricsOfResourceResponse.Data.InnerMetrics["+ i +"].BlockedQps"));
			innerMetricsItem.setTimestamp(_ctx.longValue("GetMetricsOfResourceResponse.Data.InnerMetrics["+ i +"].Timestamp"));
			innerMetricsItem.setThreadP95(_ctx.floatValue("GetMetricsOfResourceResponse.Data.InnerMetrics["+ i +"].ThreadP95"));
			innerMetricsItem.setRtStd(_ctx.floatValue("GetMetricsOfResourceResponse.Data.InnerMetrics["+ i +"].RtStd"));
			innerMetricsItem.setPassedQpsMin(_ctx.floatValue("GetMetricsOfResourceResponse.Data.InnerMetrics["+ i +"].PassedQpsMin"));
			innerMetricsItem.setBlockedQpsP99(_ctx.floatValue("GetMetricsOfResourceResponse.Data.InnerMetrics["+ i +"].BlockedQpsP99"));
			innerMetricsItem.setPassedQpsMax(_ctx.floatValue("GetMetricsOfResourceResponse.Data.InnerMetrics["+ i +"].PassedQpsMax"));
			innerMetricsItem.setExceptionMax(_ctx.floatValue("GetMetricsOfResourceResponse.Data.InnerMetrics["+ i +"].ExceptionMax"));
			innerMetricsItem.setSuccessQps(_ctx.floatValue("GetMetricsOfResourceResponse.Data.InnerMetrics["+ i +"].SuccessQps"));
			innerMetricsItem.setSuccessQpsP75(_ctx.floatValue("GetMetricsOfResourceResponse.Data.InnerMetrics["+ i +"].SuccessQpsP75"));
			innerMetricsItem.setThreadP75(_ctx.floatValue("GetMetricsOfResourceResponse.Data.InnerMetrics["+ i +"].ThreadP75"));
			innerMetricsItem.setSuccessQpsStd(_ctx.floatValue("GetMetricsOfResourceResponse.Data.InnerMetrics["+ i +"].SuccessQpsStd"));
			innerMetricsItem.setExceptionMin(_ctx.floatValue("GetMetricsOfResourceResponse.Data.InnerMetrics["+ i +"].ExceptionMin"));
			innerMetricsItem.setPassedQpsP75(_ctx.floatValue("GetMetricsOfResourceResponse.Data.InnerMetrics["+ i +"].PassedQpsP75"));
			innerMetricsItem.setPassedQps(_ctx.floatValue("GetMetricsOfResourceResponse.Data.InnerMetrics["+ i +"].PassedQps"));
			innerMetricsItem.setThreadMax(_ctx.floatValue("GetMetricsOfResourceResponse.Data.InnerMetrics["+ i +"].ThreadMax"));
			innerMetricsItem.setSuccessQpsP99(_ctx.floatValue("GetMetricsOfResourceResponse.Data.InnerMetrics["+ i +"].SuccessQpsP99"));
			innerMetricsItem.setSuccessQpsMin(_ctx.floatValue("GetMetricsOfResourceResponse.Data.InnerMetrics["+ i +"].SuccessQpsMin"));
			innerMetricsItem.setThreadP99(_ctx.floatValue("GetMetricsOfResourceResponse.Data.InnerMetrics["+ i +"].ThreadP99"));
			innerMetricsItem.setExceptionStd(_ctx.floatValue("GetMetricsOfResourceResponse.Data.InnerMetrics["+ i +"].ExceptionStd"));
			innerMetricsItem.setBlockedQpsP95(_ctx.floatValue("GetMetricsOfResourceResponse.Data.InnerMetrics["+ i +"].BlockedQpsP95"));
			innerMetricsItem.setThread(_ctx.floatValue("GetMetricsOfResourceResponse.Data.InnerMetrics["+ i +"].Thread"));
			innerMetricsItem.setThreadMin(_ctx.floatValue("GetMetricsOfResourceResponse.Data.InnerMetrics["+ i +"].ThreadMin"));
			innerMetricsItem.setRtMin(_ctx.floatValue("GetMetricsOfResourceResponse.Data.InnerMetrics["+ i +"].RtMin"));
			innerMetricsItem.setBlockedQpsAvg(_ctx.floatValue("GetMetricsOfResourceResponse.Data.InnerMetrics["+ i +"].BlockedQpsAvg"));
			innerMetricsItem.setThreadAvg(_ctx.floatValue("GetMetricsOfResourceResponse.Data.InnerMetrics["+ i +"].ThreadAvg"));
			innerMetricsItem.setBlockedQpsP75(_ctx.floatValue("GetMetricsOfResourceResponse.Data.InnerMetrics["+ i +"].BlockedQpsP75"));
			innerMetricsItem.setRtP75(_ctx.floatValue("GetMetricsOfResourceResponse.Data.InnerMetrics["+ i +"].RtP75"));
			innerMetricsItem.setExceptionP99(_ctx.floatValue("GetMetricsOfResourceResponse.Data.InnerMetrics["+ i +"].ExceptionP99"));
			innerMetricsItem.setExceptionP75(_ctx.floatValue("GetMetricsOfResourceResponse.Data.InnerMetrics["+ i +"].ExceptionP75"));
			innerMetricsItem.setSuccessQpsP95(_ctx.floatValue("GetMetricsOfResourceResponse.Data.InnerMetrics["+ i +"].SuccessQpsP95"));
			innerMetricsItem.setRt(_ctx.floatValue("GetMetricsOfResourceResponse.Data.InnerMetrics["+ i +"].Rt"));
			innerMetricsItem.setPassedQpsP95(_ctx.floatValue("GetMetricsOfResourceResponse.Data.InnerMetrics["+ i +"].PassedQpsP95"));
			innerMetricsItem.setRtMax(_ctx.floatValue("GetMetricsOfResourceResponse.Data.InnerMetrics["+ i +"].RtMax"));
			innerMetricsItem.setBlockedQpsStd(_ctx.floatValue("GetMetricsOfResourceResponse.Data.InnerMetrics["+ i +"].BlockedQpsStd"));
			innerMetricsItem.setBlockedQpsMax(_ctx.floatValue("GetMetricsOfResourceResponse.Data.InnerMetrics["+ i +"].BlockedQpsMax"));
			innerMetricsItem.setException(_ctx.floatValue("GetMetricsOfResourceResponse.Data.InnerMetrics["+ i +"].Exception"));
			innerMetricsItem.setExceptionAvg(_ctx.floatValue("GetMetricsOfResourceResponse.Data.InnerMetrics["+ i +"].ExceptionAvg"));
			innerMetricsItem.setPassedQpsStd(_ctx.floatValue("GetMetricsOfResourceResponse.Data.InnerMetrics["+ i +"].PassedQpsStd"));

			innerMetrics.add(innerMetricsItem);
		}
		data.setInnerMetrics(innerMetrics);
		getMetricsOfResourceResponse.setData(data);
	 
	 	return getMetricsOfResourceResponse;
	}
}