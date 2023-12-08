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

package com.aliyuncs.ddosdiversion.transform.v20230701;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ddosdiversion.model.v20230701.QueryNetListResponse;
import com.aliyuncs.ddosdiversion.model.v20230701.QueryNetListResponse.DataItem;
import com.aliyuncs.ddosdiversion.model.v20230701.QueryNetListResponse.DataItem.Data;
import com.aliyuncs.ddosdiversion.model.v20230701.QueryNetListResponse.DataItem.Data.DDoSDefense;
import com.aliyuncs.ddosdiversion.model.v20230701.QueryNetListResponse.DataItem.Data.DDoSDefense.CleanTh;
import com.aliyuncs.ddosdiversion.model.v20230701.QueryNetListResponse.DataItem.Data.DDoSDefense.DjPolicy;
import com.aliyuncs.ddosdiversion.model.v20230701.QueryNetListResponse.DataItem.Data.DDoSDefense.HoleTh;
import com.aliyuncs.ddosdiversion.model.v20230701.QueryNetListResponse.DataItem.Data.DeclaredItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryNetListResponseUnmarshaller {

	public static QueryNetListResponse unmarshall(QueryNetListResponse queryNetListResponse, UnmarshallerContext _ctx) {
		
		queryNetListResponse.setRequestId(_ctx.stringValue("QueryNetListResponse.RequestId"));
		queryNetListResponse.setCode(_ctx.longValue("QueryNetListResponse.Code"));
		queryNetListResponse.setMessage(_ctx.stringValue("QueryNetListResponse.Message"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryNetListResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setTotal(_ctx.longValue("QueryNetListResponse.Data["+ i +"].Total"));
			dataItem.setPage(_ctx.longValue("QueryNetListResponse.Data["+ i +"].Page"));
			dataItem.setNum(_ctx.longValue("QueryNetListResponse.Data["+ i +"].Num"));

			List<Data> nets = new ArrayList<Data>();
			for (int j = 0; j < _ctx.lengthValue("QueryNetListResponse.Data["+ i +"].Nets.Length"); j++) {
				Data data2 = new Data();
				data2.setUserId(_ctx.stringValue("QueryNetListResponse.Data["+ i +"].Nets["+ j +"].UserId"));
				data2.setSaleId(_ctx.stringValue("QueryNetListResponse.Data["+ i +"].Nets["+ j +"].SaleId"));
				data2.setUpstreamType(_ctx.stringValue("QueryNetListResponse.Data["+ i +"].Nets["+ j +"].UpstreamType"));
				data2.setNet(_ctx.stringValue("QueryNetListResponse.Data["+ i +"].Nets["+ j +"].Net"));
				data2.setNetType(_ctx.stringValue("QueryNetListResponse.Data["+ i +"].Nets["+ j +"].NetType"));
				data2.setMode(_ctx.stringValue("QueryNetListResponse.Data["+ i +"].Nets["+ j +"].Mode"));
				data2.setDeclaredState(_ctx.integerValue("QueryNetListResponse.Data["+ i +"].Nets["+ j +"].DeclaredState"));
				data2.setGmtCreate(_ctx.stringValue("QueryNetListResponse.Data["+ i +"].Nets["+ j +"].GmtCreate"));
				data2.setGmtModify(_ctx.stringValue("QueryNetListResponse.Data["+ i +"].Nets["+ j +"].GmtModify"));
				data2.setNetExtend(_ctx.longValue("QueryNetListResponse.Data["+ i +"].Nets["+ j +"].NetExtend"));
				data2.setFwdEffect(_ctx.longValue("QueryNetListResponse.Data["+ i +"].Nets["+ j +"].FwdEffect"));
				data2.setNetMain(_ctx.stringValue("QueryNetListResponse.Data["+ i +"].Nets["+ j +"].NetMain"));

				DDoSDefense dDoSDefense = new DDoSDefense();

				DjPolicy djPolicy = new DjPolicy();
				djPolicy.setPolicyName(_ctx.stringValue("QueryNetListResponse.Data["+ i +"].Nets["+ j +"].DDoSDefense.DjPolicy.PolicyName"));
				dDoSDefense.setDjPolicy(djPolicy);

				CleanTh cleanTh = new CleanTh();
				cleanTh.setMbps(_ctx.integerValue("QueryNetListResponse.Data["+ i +"].Nets["+ j +"].DDoSDefense.CleanTh.Mbps"));
				cleanTh.setPps(_ctx.integerValue("QueryNetListResponse.Data["+ i +"].Nets["+ j +"].DDoSDefense.CleanTh.Pps"));
				dDoSDefense.setCleanTh(cleanTh);

				HoleTh holeTh = new HoleTh();
				holeTh.setThreshMbps(_ctx.integerValue("QueryNetListResponse.Data["+ i +"].Nets["+ j +"].DDoSDefense.HoleTh.ThreshMbps"));
				dDoSDefense.setHoleTh(holeTh);
				data2.setDDoSDefense(dDoSDefense);

				List<DeclaredItem> declared = new ArrayList<DeclaredItem>();
				for (int k = 0; k < _ctx.lengthValue("QueryNetListResponse.Data["+ i +"].Nets["+ j +"].Declared.Length"); k++) {
					DeclaredItem declaredItem = new DeclaredItem();
					declaredItem.setRegion(_ctx.stringValue("QueryNetListResponse.Data["+ i +"].Nets["+ j +"].Declared["+ k +"].Region"));
					declaredItem.setDeclared(_ctx.stringValue("QueryNetListResponse.Data["+ i +"].Nets["+ j +"].Declared["+ k +"].Declared"));

					declared.add(declaredItem);
				}
				data2.setDeclared(declared);

				nets.add(data2);
			}
			dataItem.setNets(nets);

			data.add(dataItem);
		}
		queryNetListResponse.setData(data);
	 
	 	return queryNetListResponse;
	}
}