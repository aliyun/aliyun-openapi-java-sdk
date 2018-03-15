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

package com.aliyuncs.teslamaxcompute.transform.v20180104;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.teslamaxcompute.model.v20180104.QueryCustomerSaleInfoResponse;
import com.aliyuncs.teslamaxcompute.model.v20180104.QueryCustomerSaleInfoResponse.Data;
import com.aliyuncs.teslamaxcompute.model.v20180104.QueryCustomerSaleInfoResponse.Data.Cluster;
import com.aliyuncs.teslamaxcompute.model.v20180104.QueryCustomerSaleInfoResponse.Data.Cluster.SaleInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryCustomerSaleInfoResponseUnmarshaller {

	public static QueryCustomerSaleInfoResponse unmarshall(QueryCustomerSaleInfoResponse queryCustomerSaleInfoResponse, UnmarshallerContext context) {
		
		queryCustomerSaleInfoResponse.setRequestId(context.stringValue("QueryCustomerSaleInfoResponse.RequestId"));
		queryCustomerSaleInfoResponse.setCode(context.integerValue("QueryCustomerSaleInfoResponse.Code"));
		queryCustomerSaleInfoResponse.setMessage(context.stringValue("QueryCustomerSaleInfoResponse.Message"));

		Data data = new Data();
		data.setLastUpdate(context.stringValue("QueryCustomerSaleInfoResponse.Data.LastUpdate"));

		List<Cluster> clusters = new ArrayList<Cluster>();
		for (int i = 0; i < context.lengthValue("QueryCustomerSaleInfoResponse.Data.Clusters.Length"); i++) {
			Cluster cluster = new Cluster();
			cluster.setCluster(context.stringValue("QueryCustomerSaleInfoResponse.Data.Clusters["+ i +"].Cluster"));
			cluster.setRegion(context.stringValue("QueryCustomerSaleInfoResponse.Data.Clusters["+ i +"].Region"));
			cluster.setMachineRoom(context.stringValue("QueryCustomerSaleInfoResponse.Data.Clusters["+ i +"].MachineRoom"));

			List<SaleInfo> saleInfos = new ArrayList<SaleInfo>();
			for (int j = 0; j < context.lengthValue("QueryCustomerSaleInfoResponse.Data.Clusters["+ i +"].SaleInfos.Length"); j++) {
				SaleInfo saleInfo = new SaleInfo();
				saleInfo.setSaleMode(context.stringValue("QueryCustomerSaleInfoResponse.Data.Clusters["+ i +"].SaleInfos["+ j +"].SaleMode"));
				saleInfo.setUid(context.stringValue("QueryCustomerSaleInfoResponse.Data.Clusters["+ i +"].SaleInfos["+ j +"].Uid"));
				saleInfo.setMem(context.longValue("QueryCustomerSaleInfoResponse.Data.Clusters["+ i +"].SaleInfos["+ j +"].Mem"));
				saleInfo.setCpu(context.longValue("QueryCustomerSaleInfoResponse.Data.Clusters["+ i +"].SaleInfos["+ j +"].Cpu"));
				saleInfo.setBizCategory(context.stringValue("QueryCustomerSaleInfoResponse.Data.Clusters["+ i +"].SaleInfos["+ j +"].BizCategory"));
				saleInfo.setOwner(context.stringValue("QueryCustomerSaleInfoResponse.Data.Clusters["+ i +"].SaleInfos["+ j +"].Owner"));
				saleInfo.setQueryDate(context.stringValue("QueryCustomerSaleInfoResponse.Data.Clusters["+ i +"].SaleInfos["+ j +"].QueryDate"));

				saleInfos.add(saleInfo);
			}
			cluster.setSaleInfos(saleInfos);

			clusters.add(cluster);
		}
		data.setClusters(clusters);
		queryCustomerSaleInfoResponse.setData(data);
	 
	 	return queryCustomerSaleInfoResponse;
	}
}