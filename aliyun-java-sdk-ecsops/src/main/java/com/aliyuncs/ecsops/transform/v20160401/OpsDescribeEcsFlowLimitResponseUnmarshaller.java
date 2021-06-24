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

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeEcsFlowLimitResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeEcsFlowLimitResponse.EcsFlowLimit;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeEcsFlowLimitResponse.EcsFlowLimit.AvsInternetFlowLimit;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeEcsFlowLimitResponse.EcsFlowLimit.AvsIntranetFlowLimit;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeEcsFlowLimitResponse.EcsFlowLimit.EcsControlInternetFlowLimit;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeEcsFlowLimitResponse.EcsFlowLimit.EcsControlIntranetFlowLimit;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeEcsFlowLimitResponseUnmarshaller {

	public static OpsDescribeEcsFlowLimitResponse unmarshall(OpsDescribeEcsFlowLimitResponse opsDescribeEcsFlowLimitResponse, UnmarshallerContext _ctx) {
		
		opsDescribeEcsFlowLimitResponse.setRequestId(_ctx.stringValue("OpsDescribeEcsFlowLimitResponse.RequestId"));

		List<EcsFlowLimit> ecsFlowLimits = new ArrayList<EcsFlowLimit>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits.Length"); i++) {
			EcsFlowLimit ecsFlowLimit = new EcsFlowLimit();
			ecsFlowLimit.setNetworkType(_ctx.stringValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].NetworkType"));
			ecsFlowLimit.setInstanceId(_ctx.stringValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].InstanceId"));

			AvsIntranetFlowLimit avsIntranetFlowLimit = new AvsIntranetFlowLimit();
			avsIntranetFlowLimit.setInhibitType(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].AvsIntranetFlowLimit.InhibitType"));
			avsIntranetFlowLimit.setRxCreditConsumRate(_ctx.floatValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].AvsIntranetFlowLimit.RxCreditConsumRate"));
			avsIntranetFlowLimit.setSessionEstablishRate(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].AvsIntranetFlowLimit.SessionEstablishRate"));
			avsIntranetFlowLimit.setTxMaxCredit(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].AvsIntranetFlowLimit.TxMaxCredit"));
			avsIntranetFlowLimit.setInhibitRatio(_ctx.floatValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].AvsIntranetFlowLimit.InhibitRatio"));
			avsIntranetFlowLimit.setRxBps(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].AvsIntranetFlowLimit.RxBps"));
			avsIntranetFlowLimit.setRxBurst(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].AvsIntranetFlowLimit.RxBurst"));
			avsIntranetFlowLimit.setTxBps(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].AvsIntranetFlowLimit.TxBps"));
			avsIntranetFlowLimit.setTxCreditConsumRate(_ctx.floatValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].AvsIntranetFlowLimit.TxCreditConsumRate"));
			avsIntranetFlowLimit.setTxInitCredit(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].AvsIntranetFlowLimit.TxInitCredit"));
			avsIntranetFlowLimit.setTxPps(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].AvsIntranetFlowLimit.TxPps"));
			avsIntranetFlowLimit.setRxMaxCredit(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].AvsIntranetFlowLimit.RxMaxCredit"));
			avsIntranetFlowLimit.setTxBurst(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].AvsIntranetFlowLimit.TxBurst"));
			avsIntranetFlowLimit.setRxCreditAccumRate(_ctx.floatValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].AvsIntranetFlowLimit.RxCreditAccumRate"));
			avsIntranetFlowLimit.setSessionQuota(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].AvsIntranetFlowLimit.SessionQuota"));
			avsIntranetFlowLimit.setRxPps(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].AvsIntranetFlowLimit.RxPps"));
			avsIntranetFlowLimit.setRxInitCredit(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].AvsIntranetFlowLimit.RxInitCredit"));
			avsIntranetFlowLimit.setTxCreditAccumRate(_ctx.floatValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].AvsIntranetFlowLimit.TxCreditAccumRate"));
			ecsFlowLimit.setAvsIntranetFlowLimit(avsIntranetFlowLimit);

			EcsControlInternetFlowLimit ecsControlInternetFlowLimit = new EcsControlInternetFlowLimit();
			ecsControlInternetFlowLimit.setInhibitType(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].EcsControlInternetFlowLimit.InhibitType"));
			ecsControlInternetFlowLimit.setRxCreditConsumRate(_ctx.floatValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].EcsControlInternetFlowLimit.RxCreditConsumRate"));
			ecsControlInternetFlowLimit.setSessionEstablishRate(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].EcsControlInternetFlowLimit.SessionEstablishRate"));
			ecsControlInternetFlowLimit.setTxMaxCredit(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].EcsControlInternetFlowLimit.TxMaxCredit"));
			ecsControlInternetFlowLimit.setInhibitRatio(_ctx.floatValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].EcsControlInternetFlowLimit.InhibitRatio"));
			ecsControlInternetFlowLimit.setRxBps(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].EcsControlInternetFlowLimit.RxBps"));
			ecsControlInternetFlowLimit.setRxBurst(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].EcsControlInternetFlowLimit.RxBurst"));
			ecsControlInternetFlowLimit.setTxBps(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].EcsControlInternetFlowLimit.TxBps"));
			ecsControlInternetFlowLimit.setTxCreditConsumRate(_ctx.floatValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].EcsControlInternetFlowLimit.TxCreditConsumRate"));
			ecsControlInternetFlowLimit.setTxInitCredit(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].EcsControlInternetFlowLimit.TxInitCredit"));
			ecsControlInternetFlowLimit.setTxPps(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].EcsControlInternetFlowLimit.TxPps"));
			ecsControlInternetFlowLimit.setRxMaxCredit(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].EcsControlInternetFlowLimit.RxMaxCredit"));
			ecsControlInternetFlowLimit.setTxBurst(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].EcsControlInternetFlowLimit.TxBurst"));
			ecsControlInternetFlowLimit.setRxCreditAccumRate(_ctx.floatValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].EcsControlInternetFlowLimit.RxCreditAccumRate"));
			ecsControlInternetFlowLimit.setSessionQuota(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].EcsControlInternetFlowLimit.SessionQuota"));
			ecsControlInternetFlowLimit.setRxPps(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].EcsControlInternetFlowLimit.RxPps"));
			ecsControlInternetFlowLimit.setRxInitCredit(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].EcsControlInternetFlowLimit.RxInitCredit"));
			ecsControlInternetFlowLimit.setTxCreditAccumRate(_ctx.floatValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].EcsControlInternetFlowLimit.TxCreditAccumRate"));
			ecsFlowLimit.setEcsControlInternetFlowLimit(ecsControlInternetFlowLimit);

			EcsControlIntranetFlowLimit ecsControlIntranetFlowLimit = new EcsControlIntranetFlowLimit();
			ecsControlIntranetFlowLimit.setInhibitType(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].EcsControlIntranetFlowLimit.InhibitType"));
			ecsControlIntranetFlowLimit.setRxCreditConsumRate(_ctx.floatValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].EcsControlIntranetFlowLimit.RxCreditConsumRate"));
			ecsControlIntranetFlowLimit.setSessionEstablishRate(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].EcsControlIntranetFlowLimit.SessionEstablishRate"));
			ecsControlIntranetFlowLimit.setTxMaxCredit(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].EcsControlIntranetFlowLimit.TxMaxCredit"));
			ecsControlIntranetFlowLimit.setInhibitRatio(_ctx.floatValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].EcsControlIntranetFlowLimit.InhibitRatio"));
			ecsControlIntranetFlowLimit.setRxBps(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].EcsControlIntranetFlowLimit.RxBps"));
			ecsControlIntranetFlowLimit.setRxBurst(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].EcsControlIntranetFlowLimit.RxBurst"));
			ecsControlIntranetFlowLimit.setTxBps(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].EcsControlIntranetFlowLimit.TxBps"));
			ecsControlIntranetFlowLimit.setTxCreditConsumRate(_ctx.floatValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].EcsControlIntranetFlowLimit.TxCreditConsumRate"));
			ecsControlIntranetFlowLimit.setTxInitCredit(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].EcsControlIntranetFlowLimit.TxInitCredit"));
			ecsControlIntranetFlowLimit.setTxPps(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].EcsControlIntranetFlowLimit.TxPps"));
			ecsControlIntranetFlowLimit.setRxMaxCredit(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].EcsControlIntranetFlowLimit.RxMaxCredit"));
			ecsControlIntranetFlowLimit.setTxBurst(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].EcsControlIntranetFlowLimit.TxBurst"));
			ecsControlIntranetFlowLimit.setRxCreditAccumRate(_ctx.floatValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].EcsControlIntranetFlowLimit.RxCreditAccumRate"));
			ecsControlIntranetFlowLimit.setSessionQuota(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].EcsControlIntranetFlowLimit.SessionQuota"));
			ecsControlIntranetFlowLimit.setRxPps(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].EcsControlIntranetFlowLimit.RxPps"));
			ecsControlIntranetFlowLimit.setRxInitCredit(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].EcsControlIntranetFlowLimit.RxInitCredit"));
			ecsControlIntranetFlowLimit.setTxCreditAccumRate(_ctx.floatValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].EcsControlIntranetFlowLimit.TxCreditAccumRate"));
			ecsFlowLimit.setEcsControlIntranetFlowLimit(ecsControlIntranetFlowLimit);

			AvsInternetFlowLimit avsInternetFlowLimit = new AvsInternetFlowLimit();
			avsInternetFlowLimit.setInhibitType(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].AvsInternetFlowLimit.InhibitType"));
			avsInternetFlowLimit.setRxCreditConsumRate(_ctx.floatValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].AvsInternetFlowLimit.RxCreditConsumRate"));
			avsInternetFlowLimit.setSessionEstablishRate(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].AvsInternetFlowLimit.SessionEstablishRate"));
			avsInternetFlowLimit.setTxMaxCredit(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].AvsInternetFlowLimit.TxMaxCredit"));
			avsInternetFlowLimit.setInhibitRatio(_ctx.floatValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].AvsInternetFlowLimit.InhibitRatio"));
			avsInternetFlowLimit.setRxBps(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].AvsInternetFlowLimit.RxBps"));
			avsInternetFlowLimit.setRxBurst(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].AvsInternetFlowLimit.RxBurst"));
			avsInternetFlowLimit.setTxBps(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].AvsInternetFlowLimit.TxBps"));
			avsInternetFlowLimit.setTxCreditConsumRate(_ctx.floatValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].AvsInternetFlowLimit.TxCreditConsumRate"));
			avsInternetFlowLimit.setTxInitCredit(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].AvsInternetFlowLimit.TxInitCredit"));
			avsInternetFlowLimit.setTxPps(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].AvsInternetFlowLimit.TxPps"));
			avsInternetFlowLimit.setRxMaxCredit(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].AvsInternetFlowLimit.RxMaxCredit"));
			avsInternetFlowLimit.setTxBurst(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].AvsInternetFlowLimit.TxBurst"));
			avsInternetFlowLimit.setRxCreditAccumRate(_ctx.floatValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].AvsInternetFlowLimit.RxCreditAccumRate"));
			avsInternetFlowLimit.setSessionQuota(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].AvsInternetFlowLimit.SessionQuota"));
			avsInternetFlowLimit.setRxPps(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].AvsInternetFlowLimit.RxPps"));
			avsInternetFlowLimit.setRxInitCredit(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].AvsInternetFlowLimit.RxInitCredit"));
			avsInternetFlowLimit.setTxCreditAccumRate(_ctx.floatValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].AvsInternetFlowLimit.TxCreditAccumRate"));
			ecsFlowLimit.setAvsInternetFlowLimit(avsInternetFlowLimit);

			ecsFlowLimits.add(ecsFlowLimit);
		}
		opsDescribeEcsFlowLimitResponse.setEcsFlowLimits(ecsFlowLimits);
	 
	 	return opsDescribeEcsFlowLimitResponse;
	}
}