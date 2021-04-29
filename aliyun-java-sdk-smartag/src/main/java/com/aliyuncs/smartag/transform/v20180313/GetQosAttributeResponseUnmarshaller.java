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

package com.aliyuncs.smartag.transform.v20180313;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.smartag.model.v20180313.GetQosAttributeResponse;
import com.aliyuncs.smartag.model.v20180313.GetQosAttributeResponse.QosCar;
import com.aliyuncs.smartag.model.v20180313.GetQosAttributeResponse.QosPolicy;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetQosAttributeResponseUnmarshaller {

	public static GetQosAttributeResponse unmarshall(GetQosAttributeResponse getQosAttributeResponse, UnmarshallerContext _ctx) {
		
		getQosAttributeResponse.setRequestId(_ctx.stringValue("GetQosAttributeResponse.RequestId"));
		getQosAttributeResponse.setErrorConfigSmartAGCount(_ctx.integerValue("GetQosAttributeResponse.ErrorConfigSmartAGCount"));
		getQosAttributeResponse.setQosName(_ctx.stringValue("GetQosAttributeResponse.QosName"));
		getQosAttributeResponse.setQosDescription(_ctx.stringValue("GetQosAttributeResponse.QosDescription"));

		List<QosPolicy> qosPolicies = new ArrayList<QosPolicy>();
		for (int i = 0; i < _ctx.lengthValue("GetQosAttributeResponse.QosPolicies.Length"); i++) {
			QosPolicy qosPolicy = new QosPolicy();
			qosPolicy.setDestCidr(_ctx.stringValue("GetQosAttributeResponse.QosPolicies["+ i +"].DestCidr"));
			qosPolicy.setSourcePortRange(_ctx.stringValue("GetQosAttributeResponse.QosPolicies["+ i +"].SourcePortRange"));
			qosPolicy.setEndTime(_ctx.longValue("GetQosAttributeResponse.QosPolicies["+ i +"].EndTime"));
			qosPolicy.setSourceCidr(_ctx.stringValue("GetQosAttributeResponse.QosPolicies["+ i +"].SourceCidr"));
			qosPolicy.setPriority(_ctx.integerValue("GetQosAttributeResponse.QosPolicies["+ i +"].Priority"));
			qosPolicy.setQosPolicieName(_ctx.stringValue("GetQosAttributeResponse.QosPolicies["+ i +"].QosPolicieName"));
			qosPolicy.setQosPolicieDescription(_ctx.stringValue("GetQosAttributeResponse.QosPolicies["+ i +"].QosPolicieDescription"));
			qosPolicy.setStartTime(_ctx.longValue("GetQosAttributeResponse.QosPolicies["+ i +"].StartTime"));
			qosPolicy.setIpProtocol(_ctx.stringValue("GetQosAttributeResponse.QosPolicies["+ i +"].IpProtocol"));
			qosPolicy.setDestPortRange(_ctx.stringValue("GetQosAttributeResponse.QosPolicies["+ i +"].DestPortRange"));

			qosPolicies.add(qosPolicy);
		}
		getQosAttributeResponse.setQosPolicies(qosPolicies);

		List<QosCar> qosCars = new ArrayList<QosCar>();
		for (int i = 0; i < _ctx.lengthValue("GetQosAttributeResponse.QosCars.Length"); i++) {
			QosCar qosCar = new QosCar();
			qosCar.setMinBandwidthAbs(_ctx.integerValue("GetQosAttributeResponse.QosCars["+ i +"].MinBandwidthAbs"));
			qosCar.setQosCarId(_ctx.stringValue("GetQosAttributeResponse.QosCars["+ i +"].QosCarId"));
			qosCar.setPriority(_ctx.integerValue("GetQosAttributeResponse.QosCars["+ i +"].Priority"));
			qosCar.setQosCarDescription(_ctx.stringValue("GetQosAttributeResponse.QosCars["+ i +"].QosCarDescription"));
			qosCar.setMaxBandwidthPercent(_ctx.integerValue("GetQosAttributeResponse.QosCars["+ i +"].MaxBandwidthPercent"));
			qosCar.setMaxBandwidthAbs(_ctx.integerValue("GetQosAttributeResponse.QosCars["+ i +"].MaxBandwidthAbs"));
			qosCar.setQosCarName(_ctx.stringValue("GetQosAttributeResponse.QosCars["+ i +"].QosCarName"));
			qosCar.setPercentSourceType(_ctx.stringValue("GetQosAttributeResponse.QosCars["+ i +"].PercentSourceType"));
			qosCar.setMinBandwidthPercent(_ctx.integerValue("GetQosAttributeResponse.QosCars["+ i +"].MinBandwidthPercent"));
			qosCar.setLimitType(_ctx.stringValue("GetQosAttributeResponse.QosCars["+ i +"].LimitType"));

			qosCars.add(qosCar);
		}
		getQosAttributeResponse.setQosCars(qosCars);
	 
	 	return getQosAttributeResponse;
	}
}