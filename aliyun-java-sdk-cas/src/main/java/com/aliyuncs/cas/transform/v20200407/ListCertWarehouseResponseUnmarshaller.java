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

package com.aliyuncs.cas.transform.v20200407;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cas.model.v20200407.ListCertWarehouseResponse;
import com.aliyuncs.cas.model.v20200407.ListCertWarehouseResponse.CertWarehouse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCertWarehouseResponseUnmarshaller {

	public static ListCertWarehouseResponse unmarshall(ListCertWarehouseResponse listCertWarehouseResponse, UnmarshallerContext _ctx) {
		
		listCertWarehouseResponse.setRequestId(_ctx.stringValue("ListCertWarehouseResponse.RequestId"));
		listCertWarehouseResponse.setShowSize(_ctx.longValue("ListCertWarehouseResponse.ShowSize"));
		listCertWarehouseResponse.setCurrentPage(_ctx.longValue("ListCertWarehouseResponse.CurrentPage"));
		listCertWarehouseResponse.setTotalCount(_ctx.longValue("ListCertWarehouseResponse.TotalCount"));

		List<CertWarehouse> certWarehouseList = new ArrayList<CertWarehouse>();
		for (int i = 0; i < _ctx.lengthValue("ListCertWarehouseResponse.CertWarehouseList.Length"); i++) {
			CertWarehouse certWarehouse = new CertWarehouse();
			certWarehouse.setWhId(_ctx.longValue("ListCertWarehouseResponse.CertWarehouseList["+ i +"].WhId"));
			certWarehouse.setInstanceId(_ctx.stringValue("ListCertWarehouseResponse.CertWarehouseList["+ i +"].InstanceId"));
			certWarehouse.setName(_ctx.stringValue("ListCertWarehouseResponse.CertWarehouseList["+ i +"].Name"));
			certWarehouse.setPcaInstanceId(_ctx.stringValue("ListCertWarehouseResponse.CertWarehouseList["+ i +"].PcaInstanceId"));
			certWarehouse.setQps(_ctx.longValue("ListCertWarehouseResponse.CertWarehouseList["+ i +"].Qps"));
			certWarehouse.setType(_ctx.stringValue("ListCertWarehouseResponse.CertWarehouseList["+ i +"].Type"));
			certWarehouse.setEndTime(_ctx.longValue("ListCertWarehouseResponse.CertWarehouseList["+ i +"].EndTime"));
			certWarehouse.setIsExpired(_ctx.booleanValue("ListCertWarehouseResponse.CertWarehouseList["+ i +"].IsExpired"));

			certWarehouseList.add(certWarehouse);
		}
		listCertWarehouseResponse.setCertWarehouseList(certWarehouseList);
	 
	 	return listCertWarehouseResponse;
	}
}