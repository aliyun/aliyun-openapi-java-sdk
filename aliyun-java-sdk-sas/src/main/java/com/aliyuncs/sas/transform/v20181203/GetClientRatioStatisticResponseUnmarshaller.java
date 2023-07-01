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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.GetClientRatioStatisticResponse;
import com.aliyuncs.sas.model.v20181203.GetClientRatioStatisticResponse.ClientInstallRatio;
import com.aliyuncs.sas.model.v20181203.GetClientRatioStatisticResponse.ClientInstallRatio.CurrentItemsItem;
import com.aliyuncs.sas.model.v20181203.GetClientRatioStatisticResponse.ClientInstallRatio.CurrentItemsItem.ItemsItem;
import com.aliyuncs.sas.model.v20181203.GetClientRatioStatisticResponse.ClientInstallRatio.HistoryItemsItem;
import com.aliyuncs.sas.model.v20181203.GetClientRatioStatisticResponse.ClientInstallRatio.HistoryItemsItem.HistoryItem;
import com.aliyuncs.sas.model.v20181203.GetClientRatioStatisticResponse.ClientOnlineRatio;
import com.aliyuncs.sas.model.v20181203.GetClientRatioStatisticResponse.ClientOnlineRatio.CurrentItemsItem7;
import com.aliyuncs.sas.model.v20181203.GetClientRatioStatisticResponse.ClientOnlineRatio.CurrentItemsItem7.ItemsItem9;
import com.aliyuncs.sas.model.v20181203.GetClientRatioStatisticResponse.ClientOnlineRatio.HistoryItemsItem4;
import com.aliyuncs.sas.model.v20181203.GetClientRatioStatisticResponse.ClientOnlineRatio.HistoryItemsItem4.HistoryItem6;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetClientRatioStatisticResponseUnmarshaller {

	public static GetClientRatioStatisticResponse unmarshall(GetClientRatioStatisticResponse getClientRatioStatisticResponse, UnmarshallerContext _ctx) {
		
		getClientRatioStatisticResponse.setRequestId(_ctx.stringValue("GetClientRatioStatisticResponse.RequestId"));

		List<Long> dates = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("GetClientRatioStatisticResponse.Dates.Length"); i++) {
			dates.add(_ctx.longValue("GetClientRatioStatisticResponse.Dates["+ i +"]"));
		}
		getClientRatioStatisticResponse.setDates(dates);

		ClientInstallRatio clientInstallRatio = new ClientInstallRatio();

		List<HistoryItemsItem> historyItems = new ArrayList<HistoryItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetClientRatioStatisticResponse.ClientInstallRatio.HistoryItems.Length"); i++) {
			HistoryItemsItem historyItemsItem = new HistoryItemsItem();
			historyItemsItem.setVendor(_ctx.longValue("GetClientRatioStatisticResponse.ClientInstallRatio.HistoryItems["+ i +"].Vendor"));

			List<HistoryItem> items = new ArrayList<HistoryItem>();
			for (int j = 0; j < _ctx.lengthValue("GetClientRatioStatisticResponse.ClientInstallRatio.HistoryItems["+ i +"].Items.Length"); j++) {
				HistoryItem historyItem = new HistoryItem();
				historyItem.setCalculateTime(_ctx.longValue("GetClientRatioStatisticResponse.ClientInstallRatio.HistoryItems["+ i +"].Items["+ j +"].CalculateTime"));
				historyItem.setAssetTotalCount(_ctx.integerValue("GetClientRatioStatisticResponse.ClientInstallRatio.HistoryItems["+ i +"].Items["+ j +"].AssetTotalCount"));
				historyItem.setInstallRatio(_ctx.doubleValue("GetClientRatioStatisticResponse.ClientInstallRatio.HistoryItems["+ i +"].Items["+ j +"].InstallRatio"));
				historyItem.setInstalledAssetCount(_ctx.integerValue("GetClientRatioStatisticResponse.ClientInstallRatio.HistoryItems["+ i +"].Items["+ j +"].InstalledAssetCount"));

				items.add(historyItem);
			}
			historyItemsItem.setItems(items);

			historyItems.add(historyItemsItem);
		}
		clientInstallRatio.setHistoryItems(historyItems);

		List<CurrentItemsItem> currentItems = new ArrayList<CurrentItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetClientRatioStatisticResponse.ClientInstallRatio.CurrentItems.Length"); i++) {
			CurrentItemsItem currentItemsItem = new CurrentItemsItem();
			currentItemsItem.setVendor(_ctx.longValue("GetClientRatioStatisticResponse.ClientInstallRatio.CurrentItems["+ i +"].Vendor"));

			List<ItemsItem> items1 = new ArrayList<ItemsItem>();
			for (int j = 0; j < _ctx.lengthValue("GetClientRatioStatisticResponse.ClientInstallRatio.CurrentItems["+ i +"].Items.Length"); j++) {
				ItemsItem itemsItem = new ItemsItem();
				itemsItem.setCalculateTime(_ctx.longValue("GetClientRatioStatisticResponse.ClientInstallRatio.CurrentItems["+ i +"].Items["+ j +"].CalculateTime"));
				itemsItem.setAssetTotalCount(_ctx.integerValue("GetClientRatioStatisticResponse.ClientInstallRatio.CurrentItems["+ i +"].Items["+ j +"].AssetTotalCount"));
				itemsItem.setInstallRatio(_ctx.doubleValue("GetClientRatioStatisticResponse.ClientInstallRatio.CurrentItems["+ i +"].Items["+ j +"].InstallRatio"));
				itemsItem.setInstalledAssetCount(_ctx.integerValue("GetClientRatioStatisticResponse.ClientInstallRatio.CurrentItems["+ i +"].Items["+ j +"].InstalledAssetCount"));

				items1.add(itemsItem);
			}
			currentItemsItem.setItems1(items1);

			currentItems.add(currentItemsItem);
		}
		clientInstallRatio.setCurrentItems(currentItems);
		getClientRatioStatisticResponse.setClientInstallRatio(clientInstallRatio);

		ClientOnlineRatio clientOnlineRatio = new ClientOnlineRatio();

		List<HistoryItemsItem4> historyItems2 = new ArrayList<HistoryItemsItem4>();
		for (int i = 0; i < _ctx.lengthValue("GetClientRatioStatisticResponse.ClientOnlineRatio.HistoryItems.Length"); i++) {
			HistoryItemsItem4 historyItemsItem4 = new HistoryItemsItem4();
			historyItemsItem4.setVendor(_ctx.longValue("GetClientRatioStatisticResponse.ClientOnlineRatio.HistoryItems["+ i +"].Vendor"));

			List<HistoryItem6> items5 = new ArrayList<HistoryItem6>();
			for (int j = 0; j < _ctx.lengthValue("GetClientRatioStatisticResponse.ClientOnlineRatio.HistoryItems["+ i +"].Items.Length"); j++) {
				HistoryItem6 historyItem6 = new HistoryItem6();
				historyItem6.setCalculateTime(_ctx.longValue("GetClientRatioStatisticResponse.ClientOnlineRatio.HistoryItems["+ i +"].Items["+ j +"].CalculateTime"));
				historyItem6.setAssetInstallCount(_ctx.integerValue("GetClientRatioStatisticResponse.ClientOnlineRatio.HistoryItems["+ i +"].Items["+ j +"].AssetInstallCount"));
				historyItem6.setOnlineRatio(_ctx.doubleValue("GetClientRatioStatisticResponse.ClientOnlineRatio.HistoryItems["+ i +"].Items["+ j +"].OnlineRatio"));
				historyItem6.setOnlineAssetCount(_ctx.integerValue("GetClientRatioStatisticResponse.ClientOnlineRatio.HistoryItems["+ i +"].Items["+ j +"].OnlineAssetCount"));

				items5.add(historyItem6);
			}
			historyItemsItem4.setItems5(items5);

			historyItems2.add(historyItemsItem4);
		}
		clientOnlineRatio.setHistoryItems2(historyItems2);

		List<CurrentItemsItem7> currentItems3 = new ArrayList<CurrentItemsItem7>();
		for (int i = 0; i < _ctx.lengthValue("GetClientRatioStatisticResponse.ClientOnlineRatio.CurrentItems.Length"); i++) {
			CurrentItemsItem7 currentItemsItem7 = new CurrentItemsItem7();
			currentItemsItem7.setVendor(_ctx.longValue("GetClientRatioStatisticResponse.ClientOnlineRatio.CurrentItems["+ i +"].Vendor"));

			List<ItemsItem9> items8 = new ArrayList<ItemsItem9>();
			for (int j = 0; j < _ctx.lengthValue("GetClientRatioStatisticResponse.ClientOnlineRatio.CurrentItems["+ i +"].Items.Length"); j++) {
				ItemsItem9 itemsItem9 = new ItemsItem9();
				itemsItem9.setCalculateTime(_ctx.longValue("GetClientRatioStatisticResponse.ClientOnlineRatio.CurrentItems["+ i +"].Items["+ j +"].CalculateTime"));
				itemsItem9.setAssetInstallCount(_ctx.integerValue("GetClientRatioStatisticResponse.ClientOnlineRatio.CurrentItems["+ i +"].Items["+ j +"].AssetInstallCount"));
				itemsItem9.setOnlineRatio(_ctx.doubleValue("GetClientRatioStatisticResponse.ClientOnlineRatio.CurrentItems["+ i +"].Items["+ j +"].OnlineRatio"));
				itemsItem9.setOnlineAssetCount(_ctx.integerValue("GetClientRatioStatisticResponse.ClientOnlineRatio.CurrentItems["+ i +"].Items["+ j +"].OnlineAssetCount"));

				items8.add(itemsItem9);
			}
			currentItemsItem7.setItems8(items8);

			currentItems3.add(currentItemsItem7);
		}
		clientOnlineRatio.setCurrentItems3(currentItems3);
		getClientRatioStatisticResponse.setClientOnlineRatio(clientOnlineRatio);
	 
	 	return getClientRatioStatisticResponse;
	}
}