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

package com.aliyuncs.yunzhi.transform.v20190712;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.yunzhi.model.v20190712.ListProductBasicResponse;
import com.aliyuncs.yunzhi.model.v20190712.ListProductBasicResponse.Data;
import com.aliyuncs.yunzhi.model.v20190712.ListProductBasicResponse.Data.Product;
import com.aliyuncs.yunzhi.model.v20190712.ListProductBasicResponse.Data.Product.CategoryPathOfType;
import com.aliyuncs.yunzhi.model.v20190712.ListProductBasicResponse.Data.Product.CategoryPathOfType.Path;
import com.aliyuncs.yunzhi.model.v20190712.ListProductBasicResponse.Data.Product.GaapPdManager;
import com.aliyuncs.yunzhi.model.v20190712.ListProductBasicResponse.Data.Product.HelpDoc;
import com.aliyuncs.yunzhi.model.v20190712.ListProductBasicResponse.Data.Product.LineManager;
import com.aliyuncs.yunzhi.model.v20190712.ListProductBasicResponse.Data.Product.Pd;
import com.aliyuncs.yunzhi.model.v20190712.ListProductBasicResponse.Data.Product.PdManager;
import com.aliyuncs.yunzhi.model.v20190712.ListProductBasicResponse.Data.Product.ProductContactInfo;
import com.aliyuncs.yunzhi.model.v20190712.ListProductBasicResponse.Data.Product.ProductOwner;
import com.aliyuncs.yunzhi.model.v20190712.ListProductBasicResponse.Data.Product.PublishStatus;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListProductBasicResponseUnmarshaller {

	public static ListProductBasicResponse unmarshall(ListProductBasicResponse listProductBasicResponse, UnmarshallerContext _ctx) {
		
		listProductBasicResponse.setRequestId(_ctx.stringValue("ListProductBasicResponse.RequestId"));
		listProductBasicResponse.setMessage(_ctx.stringValue("ListProductBasicResponse.Message"));
		listProductBasicResponse.setCode(_ctx.stringValue("ListProductBasicResponse.Code"));
		listProductBasicResponse.setSuccess(_ctx.booleanValue("ListProductBasicResponse.Success"));

		Data data = new Data();
		data.setTotalCount(_ctx.integerValue("ListProductBasicResponse.Data.TotalCount"));
		data.setPageNum(_ctx.integerValue("ListProductBasicResponse.Data.PageNum"));
		data.setPageSize(_ctx.integerValue("ListProductBasicResponse.Data.PageSize"));

		List<Product> list = new ArrayList<Product>();
		for (int i = 0; i < _ctx.lengthValue("ListProductBasicResponse.Data.List.Length"); i++) {
			Product product = new Product();
			product.setAbbreviation(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].Abbreviation"));
			product.setFirstCategoryNameEn(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].FirstCategoryNameEn"));
			product.setProductLineGaapCode(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].ProductLineGaapCode"));
			product.setProductName(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].ProductName"));
			product.setDoubleCalculation(_ctx.integerValue("ListProductBasicResponse.Data.List["+ i +"].DoubleCalculation"));
			product.setLogoUrl(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].LogoUrl"));
			product.setProductId(_ctx.longValue("ListProductBasicResponse.Data.List["+ i +"].ProductId"));
			product.setFeature(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].Feature"));
			product.setAdminFirstCategoryName(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].AdminFirstCategoryName"));
			product.setDepartment(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].Department"));
			product.setServiceCode(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].ServiceCode"));
			product.setProductLineCode(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].ProductLineCode"));
			product.setSecondCategoryName(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].SecondCategoryName"));
			product.setDoubleCalculationProductName(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].DoubleCalculationProductName"));
			product.setProductLineGaapName(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].ProductLineGaapName"));
			product.setAdminSecondCategoryName(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].AdminSecondCategoryName"));
			product.setSecondCategoryId(_ctx.longValue("ListProductBasicResponse.Data.List["+ i +"].SecondCategoryId"));
			product.setNewProductLineCode(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].NewProductLineCode"));
			product.setNewProductLineName(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].NewProductLineName"));
			product.setSecondCategoryNameEn(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].SecondCategoryNameEn"));
			product.setCloudType(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].CloudType"));
			product.setProductCode(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].ProductCode"));
			product.setDoubleCalculationProductLineGaapCode(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].DoubleCalculationProductLineGaapCode"));
			product.setProductLineName(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].ProductLineName"));
			product.setAdminFirstCategoryId(_ctx.longValue("ListProductBasicResponse.Data.List["+ i +"].AdminFirstCategoryId"));
			product.setDoubleCalculationProductLineGaapName(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].DoubleCalculationProductLineGaapName"));
			product.setFirstCategoryName(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].FirstCategoryName"));
			product.setDoubleCalculationProductCode(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].DoubleCalculationProductCode"));
			product.setDoubleCalculationRate(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].DoubleCalculationRate"));
			product.setProductNameEn(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].ProductNameEn"));
			product.setId(_ctx.longValue("ListProductBasicResponse.Data.List["+ i +"].Id"));
			product.setAdminSecondCategoryId(_ctx.longValue("ListProductBasicResponse.Data.List["+ i +"].AdminSecondCategoryId"));
			product.setFirstCategoryId(_ctx.longValue("ListProductBasicResponse.Data.List["+ i +"].FirstCategoryId"));

			List<String> productAlias = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListProductBasicResponse.Data.List["+ i +"].ProductAlias.Length"); j++) {
				productAlias.add(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].ProductAlias["+ j +"]"));
			}
			product.setProductAlias(productAlias);

			ProductOwner productOwner = new ProductOwner();
			productOwner.setJobDesc(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].ProductOwner.JobDesc"));
			productOwner.setEmail(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].ProductOwner.Email"));
			productOwner.setBucid(_ctx.integerValue("ListProductBasicResponse.Data.List["+ i +"].ProductOwner.Bucid"));
			productOwner.setUserId(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].ProductOwner.UserId"));
			productOwner.setWorkid(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].ProductOwner.Workid"));
			productOwner.setLastName(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].ProductOwner.LastName"));
			productOwner.setCname(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].ProductOwner.Cname"));
			productOwner.setDep(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].ProductOwner.Dep"));
			product.setProductOwner(productOwner);

			ProductContactInfo productContactInfo = new ProductContactInfo();
			productContactInfo.setTreasurer(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].ProductContactInfo.Treasurer"));
			productContactInfo.setProductName(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].ProductContactInfo.ProductName"));
			productContactInfo.setProductCode(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].ProductContactInfo.ProductCode"));
			productContactInfo.setDocumentManager(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].ProductContactInfo.DocumentManager"));
			productContactInfo.setDesigner(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].ProductContactInfo.Designer"));
			productContactInfo.setPdStaffId(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].ProductContactInfo.PdStaffId"));
			productContactInfo.setDevOps(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].ProductContactInfo.DevOps"));
			productContactInfo.setDevelop(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].ProductContactInfo.Develop"));
			productContactInfo.setProductLineCode(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].ProductContactInfo.ProductLineCode"));
			productContactInfo.setConsole(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].ProductContactInfo.Console"));
			productContactInfo.setId(_ctx.longValue("ListProductBasicResponse.Data.List["+ i +"].ProductContactInfo.Id"));
			productContactInfo.setOperative(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].ProductContactInfo.Operative"));
			productContactInfo.setProductLine(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].ProductContactInfo.ProductLine"));
			product.setProductContactInfo(productContactInfo);

			PdManager pdManager = new PdManager();
			pdManager.setJobDesc(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].PdManager.JobDesc"));
			pdManager.setEmail(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].PdManager.Email"));
			pdManager.setBucid(_ctx.integerValue("ListProductBasicResponse.Data.List["+ i +"].PdManager.Bucid"));
			pdManager.setUserId(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].PdManager.UserId"));
			pdManager.setWorkid(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].PdManager.Workid"));
			pdManager.setLastName(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].PdManager.LastName"));
			pdManager.setCname(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].PdManager.Cname"));
			pdManager.setDep(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].PdManager.Dep"));
			product.setPdManager(pdManager);

			LineManager lineManager = new LineManager();
			lineManager.setJobDesc(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].LineManager.JobDesc"));
			lineManager.setEmail(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].LineManager.Email"));
			lineManager.setBucid(_ctx.integerValue("ListProductBasicResponse.Data.List["+ i +"].LineManager.Bucid"));
			lineManager.setUserId(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].LineManager.UserId"));
			lineManager.setWorkid(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].LineManager.Workid"));
			lineManager.setLastName(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].LineManager.LastName"));
			lineManager.setCname(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].LineManager.Cname"));
			lineManager.setDep(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].LineManager.Dep"));
			product.setLineManager(lineManager);

			List<CategoryPathOfType> categoryPaths = new ArrayList<CategoryPathOfType>();
			for (int j = 0; j < _ctx.lengthValue("ListProductBasicResponse.Data.List["+ i +"].CategoryPaths.Length"); j++) {
				CategoryPathOfType categoryPathOfType = new CategoryPathOfType();
				categoryPathOfType.setShowCategoryPath(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].CategoryPaths["+ j +"].ShowCategoryPath"));
				categoryPathOfType.setRelativeCategoryId(_ctx.longValue("ListProductBasicResponse.Data.List["+ i +"].CategoryPaths["+ j +"].RelativeCategoryId"));
				categoryPathOfType.setCategoryTypeName(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].CategoryPaths["+ j +"].CategoryTypeName"));
				categoryPathOfType.setCategoryTypeId(_ctx.longValue("ListProductBasicResponse.Data.List["+ i +"].CategoryPaths["+ j +"].CategoryTypeId"));

				List<Path> categoryPath = new ArrayList<Path>();
				for (int k = 0; k < _ctx.lengthValue("ListProductBasicResponse.Data.List["+ i +"].CategoryPaths["+ j +"].CategoryPath.Length"); k++) {
					Path path = new Path();
					path.setCategoryId(_ctx.longValue("ListProductBasicResponse.Data.List["+ i +"].CategoryPaths["+ j +"].CategoryPath["+ k +"].CategoryId"));
					path.setCategoryCode(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].CategoryPaths["+ j +"].CategoryPath["+ k +"].CategoryCode"));
					path.setCategoryLogoUrl(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].CategoryPaths["+ j +"].CategoryPath["+ k +"].CategoryLogoUrl"));
					path.setCategoryName(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].CategoryPaths["+ j +"].CategoryPath["+ k +"].CategoryName"));
					path.setSort(_ctx.integerValue("ListProductBasicResponse.Data.List["+ i +"].CategoryPaths["+ j +"].CategoryPath["+ k +"].Sort"));
					path.setCategoryLevel(_ctx.integerValue("ListProductBasicResponse.Data.List["+ i +"].CategoryPaths["+ j +"].CategoryPath["+ k +"].CategoryLevel"));
					path.setCategoryTypeId(_ctx.longValue("ListProductBasicResponse.Data.List["+ i +"].CategoryPaths["+ j +"].CategoryPath["+ k +"].CategoryTypeId"));
					path.setCategoryNameEn(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].CategoryPaths["+ j +"].CategoryPath["+ k +"].CategoryNameEn"));
					path.setParentCategoryId(_ctx.longValue("ListProductBasicResponse.Data.List["+ i +"].CategoryPaths["+ j +"].CategoryPath["+ k +"].ParentCategoryId"));

					categoryPath.add(path);
				}
				categoryPathOfType.setCategoryPath(categoryPath);

				categoryPaths.add(categoryPathOfType);
			}
			product.setCategoryPaths(categoryPaths);

			List<PublishStatus> publishStatusDTOList = new ArrayList<PublishStatus>();
			for (int j = 0; j < _ctx.lengthValue("ListProductBasicResponse.Data.List["+ i +"].PublishStatusDTOList.Length"); j++) {
				PublishStatus publishStatus = new PublishStatus();
				publishStatus.setStatus(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].PublishStatusDTOList["+ j +"].Status"));
				publishStatus.setCloudType(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].PublishStatusDTOList["+ j +"].CloudType"));
				publishStatus.setDate(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].PublishStatusDTOList["+ j +"].Date"));

				publishStatusDTOList.add(publishStatus);
			}
			product.setPublishStatusDTOList(publishStatusDTOList);

			List<Pd> pds = new ArrayList<Pd>();
			for (int j = 0; j < _ctx.lengthValue("ListProductBasicResponse.Data.List["+ i +"].Pds.Length"); j++) {
				Pd pd = new Pd();
				pd.setJobDesc(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].Pds["+ j +"].JobDesc"));
				pd.setEmail(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].Pds["+ j +"].Email"));
				pd.setBucid(_ctx.integerValue("ListProductBasicResponse.Data.List["+ i +"].Pds["+ j +"].Bucid"));
				pd.setUserId(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].Pds["+ j +"].UserId"));
				pd.setWorkid(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].Pds["+ j +"].Workid"));
				pd.setLastName(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].Pds["+ j +"].LastName"));
				pd.setCname(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].Pds["+ j +"].Cname"));
				pd.setDep(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].Pds["+ j +"].Dep"));

				pds.add(pd);
			}
			product.setPds(pds);

			List<GaapPdManager> productLineGaapLinePdManagers = new ArrayList<GaapPdManager>();
			for (int j = 0; j < _ctx.lengthValue("ListProductBasicResponse.Data.List["+ i +"].ProductLineGaapLinePdManagers.Length"); j++) {
				GaapPdManager gaapPdManager = new GaapPdManager();
				gaapPdManager.setJobDesc(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].ProductLineGaapLinePdManagers["+ j +"].JobDesc"));
				gaapPdManager.setEmail(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].ProductLineGaapLinePdManagers["+ j +"].Email"));
				gaapPdManager.setBucid(_ctx.integerValue("ListProductBasicResponse.Data.List["+ i +"].ProductLineGaapLinePdManagers["+ j +"].Bucid"));
				gaapPdManager.setUserId(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].ProductLineGaapLinePdManagers["+ j +"].UserId"));
				gaapPdManager.setWorkid(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].ProductLineGaapLinePdManagers["+ j +"].Workid"));
				gaapPdManager.setLastName(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].ProductLineGaapLinePdManagers["+ j +"].LastName"));
				gaapPdManager.setCname(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].ProductLineGaapLinePdManagers["+ j +"].Cname"));
				gaapPdManager.setDep(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].ProductLineGaapLinePdManagers["+ j +"].Dep"));

				productLineGaapLinePdManagers.add(gaapPdManager);
			}
			product.setProductLineGaapLinePdManagers(productLineGaapLinePdManagers);

			List<GaapPdManager> productLineGaapPdManagers = new ArrayList<GaapPdManager>();
			for (int j = 0; j < _ctx.lengthValue("ListProductBasicResponse.Data.List["+ i +"].ProductLineGaapPdManagers.Length"); j++) {
				GaapPdManager gaapPdManager1 = new GaapPdManager();
				gaapPdManager1.setJobDesc(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].ProductLineGaapPdManagers["+ j +"].JobDesc"));
				gaapPdManager1.setEmail(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].ProductLineGaapPdManagers["+ j +"].Email"));
				gaapPdManager1.setBucid(_ctx.integerValue("ListProductBasicResponse.Data.List["+ i +"].ProductLineGaapPdManagers["+ j +"].Bucid"));
				gaapPdManager1.setUserId(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].ProductLineGaapPdManagers["+ j +"].UserId"));
				gaapPdManager1.setWorkid(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].ProductLineGaapPdManagers["+ j +"].Workid"));
				gaapPdManager1.setLastName(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].ProductLineGaapPdManagers["+ j +"].LastName"));
				gaapPdManager1.setCname(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].ProductLineGaapPdManagers["+ j +"].Cname"));
				gaapPdManager1.setDep(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].ProductLineGaapPdManagers["+ j +"].Dep"));

				productLineGaapPdManagers.add(gaapPdManager1);
			}
			product.setProductLineGaapPdManagers(productLineGaapPdManagers);

			List<HelpDoc> helpDocs = new ArrayList<HelpDoc>();
			for (int j = 0; j < _ctx.lengthValue("ListProductBasicResponse.Data.List["+ i +"].HelpDocs.Length"); j++) {
				HelpDoc helpDoc = new HelpDoc();
				helpDoc.setDocId(_ctx.longValue("ListProductBasicResponse.Data.List["+ i +"].HelpDocs["+ j +"].DocId"));
				helpDoc.setDocUrl(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].HelpDocs["+ j +"].DocUrl"));
				helpDoc.setProductCode(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].HelpDocs["+ j +"].ProductCode"));
				helpDoc.setDocName(_ctx.stringValue("ListProductBasicResponse.Data.List["+ i +"].HelpDocs["+ j +"].DocName"));

				helpDocs.add(helpDoc);
			}
			product.setHelpDocs(helpDocs);

			list.add(product);
		}
		data.setList(list);
		listProductBasicResponse.setData(data);
	 
	 	return listProductBasicResponse;
	}
}