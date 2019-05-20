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

package com.aliyuncs.yundun_ds.transform.v20190103;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.yundun_ds.model.v20190103.DescribeDataTotalCountResponse;
import com.aliyuncs.yundun_ds.model.v20190103.DescribeDataTotalCountResponse.DataCount;
import com.aliyuncs.yundun_ds.model.v20190103.DescribeDataTotalCountResponse.DataCount.Column;
import com.aliyuncs.yundun_ds.model.v20190103.DescribeDataTotalCountResponse.DataCount.Column.RiskCount6;
import com.aliyuncs.yundun_ds.model.v20190103.DescribeDataTotalCountResponse.DataCount.Instance;
import com.aliyuncs.yundun_ds.model.v20190103.DescribeDataTotalCountResponse.DataCount.Instance.RiskCount;
import com.aliyuncs.yundun_ds.model.v20190103.DescribeDataTotalCountResponse.DataCount.Oss;
import com.aliyuncs.yundun_ds.model.v20190103.DescribeDataTotalCountResponse.DataCount.Oss.RiskCount8;
import com.aliyuncs.yundun_ds.model.v20190103.DescribeDataTotalCountResponse.DataCount.Table;
import com.aliyuncs.yundun_ds.model.v20190103.DescribeDataTotalCountResponse.DataCount.Table.RiskCount2;
import com.aliyuncs.yundun_ds.model.v20190103.DescribeDataTotalCountResponse.DataCount._Package;
import com.aliyuncs.yundun_ds.model.v20190103.DescribeDataTotalCountResponse.DataCount._Package.RiskCount4;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDataTotalCountResponseUnmarshaller {

	public static DescribeDataTotalCountResponse unmarshall(DescribeDataTotalCountResponse describeDataTotalCountResponse, UnmarshallerContext context) {
		
		describeDataTotalCountResponse.setRequestId(context.stringValue("DescribeDataTotalCountResponse.RequestId"));

		DataCount dataCount = new DataCount();

		Instance instance = new Instance();
		instance.setTotalCount(context.longValue("DescribeDataTotalCountResponse.DataCount.Instance.TotalCount"));
		instance.setCount(context.longValue("DescribeDataTotalCountResponse.DataCount.Instance.Count"));
		instance.setSensitiveCount(context.longValue("DescribeDataTotalCountResponse.DataCount.Instance.SensitiveCount"));
		instance.setLastCount(context.longValue("DescribeDataTotalCountResponse.DataCount.Instance.LastCount"));
		instance.setLastSensitiveCount(context.longValue("DescribeDataTotalCountResponse.DataCount.Instance.LastSensitiveCount"));

		List<RiskCount> riskCountList = new ArrayList<RiskCount>();
		for (int i = 0; i < context.lengthValue("DescribeDataTotalCountResponse.DataCount.Instance.RiskCountList.Length"); i++) {
			RiskCount riskCount = new RiskCount();
			riskCount.setId(context.longValue("DescribeDataTotalCountResponse.DataCount.Instance.RiskCountList["+ i +"].Id"));
			riskCount.setName(context.stringValue("DescribeDataTotalCountResponse.DataCount.Instance.RiskCountList["+ i +"].Name"));
			riskCount.setCount(context.longValue("DescribeDataTotalCountResponse.DataCount.Instance.RiskCountList["+ i +"].Count"));

			riskCountList.add(riskCount);
		}
		instance.setRiskCountList(riskCountList);
		dataCount.setInstance(instance);

		Table table = new Table();
		table.setTotalCount(context.longValue("DescribeDataTotalCountResponse.DataCount.Table.TotalCount"));
		table.setCount(context.longValue("DescribeDataTotalCountResponse.DataCount.Table.Count"));
		table.setSensitiveCount(context.longValue("DescribeDataTotalCountResponse.DataCount.Table.SensitiveCount"));
		table.setLastCount(context.longValue("DescribeDataTotalCountResponse.DataCount.Table.LastCount"));
		table.setLastSensitiveCount(context.longValue("DescribeDataTotalCountResponse.DataCount.Table.LastSensitiveCount"));

		List<RiskCount2> riskCountList1 = new ArrayList<RiskCount2>();
		for (int i = 0; i < context.lengthValue("DescribeDataTotalCountResponse.DataCount.Table.RiskCountList.Length"); i++) {
			RiskCount2 riskCount2 = new RiskCount2();
			riskCount2.setId(context.longValue("DescribeDataTotalCountResponse.DataCount.Table.RiskCountList["+ i +"].Id"));
			riskCount2.setName(context.stringValue("DescribeDataTotalCountResponse.DataCount.Table.RiskCountList["+ i +"].Name"));
			riskCount2.setCount(context.longValue("DescribeDataTotalCountResponse.DataCount.Table.RiskCountList["+ i +"].Count"));

			riskCountList1.add(riskCount2);
		}
		table.setRiskCountList1(riskCountList1);
		dataCount.setTable(table);

		_Package _package = new _Package();
		_package.setTotalCount(context.longValue("DescribeDataTotalCountResponse.DataCount.Package.TotalCount"));
		_package.setCount(context.longValue("DescribeDataTotalCountResponse.DataCount.Package.Count"));
		_package.setSensitiveCount(context.longValue("DescribeDataTotalCountResponse.DataCount.Package.SensitiveCount"));
		_package.setLastCount(context.longValue("DescribeDataTotalCountResponse.DataCount.Package.LastCount"));
		_package.setLastSensitiveCount(context.longValue("DescribeDataTotalCountResponse.DataCount.Package.LastSensitiveCount"));

		List<RiskCount4> riskCountList3 = new ArrayList<RiskCount4>();
		for (int i = 0; i < context.lengthValue("DescribeDataTotalCountResponse.DataCount.Package.RiskCountList.Length"); i++) {
			RiskCount4 riskCount4 = new RiskCount4();
			riskCount4.setId(context.longValue("DescribeDataTotalCountResponse.DataCount.Package.RiskCountList["+ i +"].Id"));
			riskCount4.setName(context.stringValue("DescribeDataTotalCountResponse.DataCount.Package.RiskCountList["+ i +"].Name"));
			riskCount4.setCount(context.longValue("DescribeDataTotalCountResponse.DataCount.Package.RiskCountList["+ i +"].Count"));

			riskCountList3.add(riskCount4);
		}
		_package.setRiskCountList3(riskCountList3);
		dataCount.set_Package(_package);

		Column column = new Column();
		column.setTotalCount(context.longValue("DescribeDataTotalCountResponse.DataCount.Column.TotalCount"));
		column.setCount(context.longValue("DescribeDataTotalCountResponse.DataCount.Column.Count"));
		column.setSensitiveCount(context.longValue("DescribeDataTotalCountResponse.DataCount.Column.SensitiveCount"));
		column.setLastCount(context.longValue("DescribeDataTotalCountResponse.DataCount.Column.LastCount"));
		column.setLastSensitiveCount(context.longValue("DescribeDataTotalCountResponse.DataCount.Column.LastSensitiveCount"));

		List<RiskCount6> riskCountList5 = new ArrayList<RiskCount6>();
		for (int i = 0; i < context.lengthValue("DescribeDataTotalCountResponse.DataCount.Column.RiskCountList.Length"); i++) {
			RiskCount6 riskCount6 = new RiskCount6();
			riskCount6.setId(context.longValue("DescribeDataTotalCountResponse.DataCount.Column.RiskCountList["+ i +"].Id"));
			riskCount6.setName(context.stringValue("DescribeDataTotalCountResponse.DataCount.Column.RiskCountList["+ i +"].Name"));
			riskCount6.setCount(context.longValue("DescribeDataTotalCountResponse.DataCount.Column.RiskCountList["+ i +"].Count"));

			riskCountList5.add(riskCount6);
		}
		column.setRiskCountList5(riskCountList5);
		dataCount.setColumn(column);

		Oss oss = new Oss();
		oss.setTotalCount(context.longValue("DescribeDataTotalCountResponse.DataCount.Oss.TotalCount"));
		oss.setCount(context.longValue("DescribeDataTotalCountResponse.DataCount.Oss.Count"));
		oss.setSensitiveCount(context.longValue("DescribeDataTotalCountResponse.DataCount.Oss.SensitiveCount"));
		oss.setLastCount(context.longValue("DescribeDataTotalCountResponse.DataCount.Oss.LastCount"));
		oss.setLastSensitiveCount(context.longValue("DescribeDataTotalCountResponse.DataCount.Oss.LastSensitiveCount"));

		List<RiskCount8> riskCountList7 = new ArrayList<RiskCount8>();
		for (int i = 0; i < context.lengthValue("DescribeDataTotalCountResponse.DataCount.Oss.RiskCountList.Length"); i++) {
			RiskCount8 riskCount8 = new RiskCount8();
			riskCount8.setId(context.longValue("DescribeDataTotalCountResponse.DataCount.Oss.RiskCountList["+ i +"].Id"));
			riskCount8.setName(context.stringValue("DescribeDataTotalCountResponse.DataCount.Oss.RiskCountList["+ i +"].Name"));
			riskCount8.setCount(context.longValue("DescribeDataTotalCountResponse.DataCount.Oss.RiskCountList["+ i +"].Count"));

			riskCountList7.add(riskCount8);
		}
		oss.setRiskCountList7(riskCountList7);
		dataCount.setOss(oss);
		describeDataTotalCountResponse.setDataCount(dataCount);
	 
	 	return describeDataTotalCountResponse;
	}
}