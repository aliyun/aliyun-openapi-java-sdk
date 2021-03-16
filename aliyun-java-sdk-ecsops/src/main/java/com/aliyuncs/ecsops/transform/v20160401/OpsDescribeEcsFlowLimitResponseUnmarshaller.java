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
			ecsFlowLimit.setInstanceId(_ctx.stringValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].InstanceId"));
			ecsFlowLimit.setNetworkType(_ctx.stringValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].NetworkType"));

			EcsControlIntranetFlowLimit ecsControlIntranetFlowLimit = new EcsControlIntranetFlowLimit();
			ecsControlIntranetFlowLimit.setTxBps(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].EcsControlIntranetFlowLimit.TxBps"));
			ecsControlIntranetFlowLimit.setRxBps(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].EcsControlIntranetFlowLimit.RxBps"));
			ecsControlIntranetFlowLimit.setTxPps(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].EcsControlIntranetFlowLimit.TxPps"));
			ecsControlIntranetFlowLimit.setRxPps(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].EcsControlIntranetFlowLimit.RxPps"));
			ecsControlIntranetFlowLimit.setTxBurst(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].EcsControlIntranetFlowLimit.TxBurst"));
			ecsControlIntranetFlowLimit.setRxBurst(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].EcsControlIntranetFlowLimit.RxBurst"));
			ecsControlIntranetFlowLimit.setTxInitCredit(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].EcsControlIntranetFlowLimit.TxInitCredit"));
			ecsControlIntranetFlowLimit.setRxInitCredit(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].EcsControlIntranetFlowLimit.RxInitCredit"));
			ecsControlIntranetFlowLimit.setTxMaxCredit(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].EcsControlIntranetFlowLimit.TxMaxCredit"));
			ecsControlIntranetFlowLimit.setRxMaxCredit(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].EcsControlIntranetFlowLimit.RxMaxCredit"));
			ecsControlIntranetFlowLimit.setTxCreditAccumRate(_ctx.floatValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].EcsControlIntranetFlowLimit.TxCreditAccumRate"));
			ecsControlIntranetFlowLimit.setRxCreditAccumRate(_ctx.floatValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].EcsControlIntranetFlowLimit.RxCreditAccumRate"));
			ecsControlIntranetFlowLimit.setTxCreditConsumRate(_ctx.floatValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].EcsControlIntranetFlowLimit.TxCreditConsumRate"));
			ecsControlIntranetFlowLimit.setRxCreditConsumRate(_ctx.floatValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].EcsControlIntranetFlowLimit.RxCreditConsumRate"));
			ecsControlIntranetFlowLimit.setSessionQuota(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].EcsControlIntranetFlowLimit.SessionQuota"));
			ecsControlIntranetFlowLimit.setSessionEstablishRate(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].EcsControlIntranetFlowLimit.SessionEstablishRate"));
			ecsControlIntranetFlowLimit.setInhibitType(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].EcsControlIntranetFlowLimit.InhibitType"));
			ecsControlIntranetFlowLimit.setInhibitRatio(_ctx.floatValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].EcsControlIntranetFlowLimit.InhibitRatio"));
			ecsFlowLimit.setEcsControlIntranetFlowLimit(ecsControlIntranetFlowLimit);

			EcsControlInternetFlowLimit ecsControlInternetFlowLimit = new EcsControlInternetFlowLimit();
			ecsControlInternetFlowLimit.setTxBps(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].EcsControlInternetFlowLimit.TxBps"));
			ecsControlInternetFlowLimit.setRxBps(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].EcsControlInternetFlowLimit.RxBps"));
			ecsControlInternetFlowLimit.setTxPps(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].EcsControlInternetFlowLimit.TxPps"));
			ecsControlInternetFlowLimit.setRxPps(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].EcsControlInternetFlowLimit.RxPps"));
			ecsControlInternetFlowLimit.setTxBurst(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].EcsControlInternetFlowLimit.TxBurst"));
			ecsControlInternetFlowLimit.setRxBurst(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].EcsControlInternetFlowLimit.RxBurst"));
			ecsControlInternetFlowLimit.setTxInitCredit(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].EcsControlInternetFlowLimit.TxInitCredit"));
			ecsControlInternetFlowLimit.setRxInitCredit(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].EcsControlInternetFlowLimit.RxInitCredit"));
			ecsControlInternetFlowLimit.setTxMaxCredit(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].EcsControlInternetFlowLimit.TxMaxCredit"));
			ecsControlInternetFlowLimit.setRxMaxCredit(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].EcsControlInternetFlowLimit.RxMaxCredit"));
			ecsControlInternetFlowLimit.setTxCreditAccumRate(_ctx.floatValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].EcsControlInternetFlowLimit.TxCreditAccumRate"));
			ecsControlInternetFlowLimit.setRxCreditAccumRate(_ctx.floatValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].EcsControlInternetFlowLimit.RxCreditAccumRate"));
			ecsControlInternetFlowLimit.setTxCreditConsumRate(_ctx.floatValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].EcsControlInternetFlowLimit.TxCreditConsumRate"));
			ecsControlInternetFlowLimit.setRxCreditConsumRate(_ctx.floatValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].EcsControlInternetFlowLimit.RxCreditConsumRate"));
			ecsControlInternetFlowLimit.setSessionQuota(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].EcsControlInternetFlowLimit.SessionQuota"));
			ecsControlInternetFlowLimit.setSessionEstablishRate(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].EcsControlInternetFlowLimit.SessionEstablishRate"));
			ecsControlInternetFlowLimit.setInhibitType(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].EcsControlInternetFlowLimit.InhibitType"));
			ecsControlInternetFlowLimit.setInhibitRatio(_ctx.floatValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].EcsControlInternetFlowLimit.InhibitRatio"));
			ecsFlowLimit.setEcsControlInternetFlowLimit(ecsControlInternetFlowLimit);

			AvsIntranetFlowLimit avsIntranetFlowLimit = new AvsIntranetFlowLimit();
			avsIntranetFlowLimit.setTxBps(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].AvsIntranetFlowLimit.TxBps"));
			avsIntranetFlowLimit.setRxBps(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].AvsIntranetFlowLimit.RxBps"));
			avsIntranetFlowLimit.setTxPps(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].AvsIntranetFlowLimit.TxPps"));
			avsIntranetFlowLimit.setRxPps(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].AvsIntranetFlowLimit.RxPps"));
			avsIntranetFlowLimit.setTxBurst(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].AvsIntranetFlowLimit.TxBurst"));
			avsIntranetFlowLimit.setRxBurst(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].AvsIntranetFlowLimit.RxBurst"));
			avsIntranetFlowLimit.setTxInitCredit(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].AvsIntranetFlowLimit.TxInitCredit"));
			avsIntranetFlowLimit.setRxInitCredit(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].AvsIntranetFlowLimit.RxInitCredit"));
			avsIntranetFlowLimit.setTxMaxCredit(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].AvsIntranetFlowLimit.TxMaxCredit"));
			avsIntranetFlowLimit.setRxMaxCredit(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].AvsIntranetFlowLimit.RxMaxCredit"));
			avsIntranetFlowLimit.setTxCreditAccumRate(_ctx.floatValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].AvsIntranetFlowLimit.TxCreditAccumRate"));
			avsIntranetFlowLimit.setRxCreditAccumRate(_ctx.floatValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].AvsIntranetFlowLimit.RxCreditAccumRate"));
			avsIntranetFlowLimit.setTxCreditConsumRate(_ctx.floatValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].AvsIntranetFlowLimit.TxCreditConsumRate"));
			avsIntranetFlowLimit.setRxCreditConsumRate(_ctx.floatValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].AvsIntranetFlowLimit.RxCreditConsumRate"));
			avsIntranetFlowLimit.setSessionQuota(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].AvsIntranetFlowLimit.SessionQuota"));
			avsIntranetFlowLimit.setSessionEstablishRate(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].AvsIntranetFlowLimit.SessionEstablishRate"));
			avsIntranetFlowLimit.setInhibitType(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].AvsIntranetFlowLimit.InhibitType"));
			avsIntranetFlowLimit.setInhibitRatio(_ctx.floatValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].AvsIntranetFlowLimit.InhibitRatio"));
			ecsFlowLimit.setAvsIntranetFlowLimit(avsIntranetFlowLimit);

			AvsInternetFlowLimit avsInternetFlowLimit = new AvsInternetFlowLimit();
			avsInternetFlowLimit.setTxBps(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].AvsInternetFlowLimit.TxBps"));
			avsInternetFlowLimit.setRxBps(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].AvsInternetFlowLimit.RxBps"));
			avsInternetFlowLimit.setTxPps(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].AvsInternetFlowLimit.TxPps"));
			avsInternetFlowLimit.setRxPps(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].AvsInternetFlowLimit.RxPps"));
			avsInternetFlowLimit.setTxBurst(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].AvsInternetFlowLimit.TxBurst"));
			avsInternetFlowLimit.setRxBurst(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].AvsInternetFlowLimit.RxBurst"));
			avsInternetFlowLimit.setTxInitCredit(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].AvsInternetFlowLimit.TxInitCredit"));
			avsInternetFlowLimit.setRxInitCredit(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].AvsInternetFlowLimit.RxInitCredit"));
			avsInternetFlowLimit.setTxMaxCredit(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].AvsInternetFlowLimit.TxMaxCredit"));
			avsInternetFlowLimit.setRxMaxCredit(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].AvsInternetFlowLimit.RxMaxCredit"));
			avsInternetFlowLimit.setTxCreditAccumRate(_ctx.floatValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].AvsInternetFlowLimit.TxCreditAccumRate"));
			avsInternetFlowLimit.setRxCreditAccumRate(_ctx.floatValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].AvsInternetFlowLimit.RxCreditAccumRate"));
			avsInternetFlowLimit.setTxCreditConsumRate(_ctx.floatValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].AvsInternetFlowLimit.TxCreditConsumRate"));
			avsInternetFlowLimit.setRxCreditConsumRate(_ctx.floatValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].AvsInternetFlowLimit.RxCreditConsumRate"));
			avsInternetFlowLimit.setSessionQuota(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].AvsInternetFlowLimit.SessionQuota"));
			avsInternetFlowLimit.setSessionEstablishRate(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].AvsInternetFlowLimit.SessionEstablishRate"));
			avsInternetFlowLimit.setInhibitType(_ctx.longValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].AvsInternetFlowLimit.InhibitType"));
			avsInternetFlowLimit.setInhibitRatio(_ctx.floatValue("OpsDescribeEcsFlowLimitResponse.EcsFlowLimits["+ i +"].AvsInternetFlowLimit.InhibitRatio"));
			ecsFlowLimit.setAvsInternetFlowLimit(avsInternetFlowLimit);

			ecsFlowLimits.add(ecsFlowLimit);
		}
		opsDescribeEcsFlowLimitResponse.setEcsFlowLimits(ecsFlowLimits);
	 
	 	return opsDescribeEcsFlowLimitResponse;
	}
}