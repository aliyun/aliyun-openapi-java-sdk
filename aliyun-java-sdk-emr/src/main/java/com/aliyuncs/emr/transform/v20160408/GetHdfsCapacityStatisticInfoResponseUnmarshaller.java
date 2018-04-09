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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.GetHdfsCapacityStatisticInfoResponse;
import com.aliyuncs.emr.model.v20160408.GetHdfsCapacityStatisticInfoResponse.ClusterStatHdfsCapacity;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetHdfsCapacityStatisticInfoResponseUnmarshaller {

	public static GetHdfsCapacityStatisticInfoResponse unmarshall(GetHdfsCapacityStatisticInfoResponse getHdfsCapacityStatisticInfoResponse, UnmarshallerContext context) {
		
		getHdfsCapacityStatisticInfoResponse.setRequestId(context.stringValue("GetHdfsCapacityStatisticInfoResponse.RequestId"));

		List<ClusterStatHdfsCapacity> hdfsCapacityList = new ArrayList<ClusterStatHdfsCapacity>();
		for (int i = 0; i < context.lengthValue("GetHdfsCapacityStatisticInfoResponse.HdfsCapacityList.Length"); i++) {
			ClusterStatHdfsCapacity clusterStatHdfsCapacity = new ClusterStatHdfsCapacity();
			clusterStatHdfsCapacity.setCapacityTotal(context.longValue("GetHdfsCapacityStatisticInfoResponse.HdfsCapacityList["+ i +"].CapacityTotal"));
			clusterStatHdfsCapacity.setCapacityTotalGB(context.longValue("GetHdfsCapacityStatisticInfoResponse.HdfsCapacityList["+ i +"].CapacityTotalGB"));
			clusterStatHdfsCapacity.setCapacityUsed(context.longValue("GetHdfsCapacityStatisticInfoResponse.HdfsCapacityList["+ i +"].CapacityUsed"));
			clusterStatHdfsCapacity.setCapacityUsedGB(context.longValue("GetHdfsCapacityStatisticInfoResponse.HdfsCapacityList["+ i +"].CapacityUsedGB"));
			clusterStatHdfsCapacity.setCapacityRemaining(context.longValue("GetHdfsCapacityStatisticInfoResponse.HdfsCapacityList["+ i +"].CapacityRemaining"));
			clusterStatHdfsCapacity.setCapacityRemainingGB(context.longValue("GetHdfsCapacityStatisticInfoResponse.HdfsCapacityList["+ i +"].CapacityRemainingGB"));
			clusterStatHdfsCapacity.setCapacityUsedNonDfs(context.longValue("GetHdfsCapacityStatisticInfoResponse.HdfsCapacityList["+ i +"].CapacityUsedNonDfs"));
			clusterStatHdfsCapacity.setClusterBizId(context.stringValue("GetHdfsCapacityStatisticInfoResponse.HdfsCapacityList["+ i +"].ClusterBizId"));
			clusterStatHdfsCapacity.setDateTime(context.stringValue("GetHdfsCapacityStatisticInfoResponse.HdfsCapacityList["+ i +"].DateTime"));

			hdfsCapacityList.add(clusterStatHdfsCapacity);
		}
		getHdfsCapacityStatisticInfoResponse.setHdfsCapacityList(hdfsCapacityList);
	 
	 	return getHdfsCapacityStatisticInfoResponse;
	}
}