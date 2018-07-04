package com.example.hp.cloudsapp;

import android.content.Context;

import java.util.ArrayList;

public class CloudProvider {
    public static ArrayList<CloudsModel> getProviderCloud(Context context) {

        ArrayList<CloudsModel> cloudList = new ArrayList<>();
        final CloudsModel cloudsModel1 = new CloudsModel();
        cloudsModel1.setTitle(context.getString(R.string.model1Title));
        cloudsModel1.setDescription(context.getString(R.string.model1Description));
        cloudsModel1.setSort(context.getString(R.string.model1sort));
        cloudsModel1.setImageUrl(context.getString(R.string.model1imageUri));
        cloudsModel1.setInformationUri(context.getString(R.string.model1InformationUri));

        final CloudsModel cloudsModel2 = new CloudsModel();
        cloudsModel2.setTitle(context.getString(R.string.model2Title));
        cloudsModel2.setDescription(context.getString(R.string.model2Description));
        cloudsModel2.setSort(context.getString(R.string.model2Sort));
        cloudsModel2.setImageUrl(context.getString(R.string.model2ImageUri));
        cloudsModel2.setInformationUri(context.getString(R.string.model2InformationUri));

        final CloudsModel cloudsModel3 = new CloudsModel();
        cloudsModel3.setTitle(context.getString(R.string.model3Title));
        cloudsModel3.setDescription(context.getString(R.string.model3Description));
        cloudsModel3.setSort(context.getString(R.string.model3Sort));
        cloudsModel3.setImageUrl(context.getString(R.string.model3ImageUri));
        cloudsModel3.setInformationUri(context.getString(R.string.model3InformationUri));

        final CloudsModel cloudsModel4 = new CloudsModel();
        cloudsModel4.setTitle(context.getString(R.string.model4Title));
        cloudsModel4.setDescription(context.getString(R.string.model4Description));
        cloudsModel4.setSort(context.getString(R.string.model4Sort));
        cloudsModel4.setImageUrl(context.getString(R.string.model4ImageUri));
        cloudsModel4.setInformationUri(context.getString(R.string.model4InfoUri));

        final CloudsModel cloudsModel5 = new CloudsModel();
        cloudsModel5.setTitle(context.getString(R.string.model5Title));
        cloudsModel5.setDescription(context.getString(R.string.model5Description));
        cloudsModel5.setSort(context.getString(R.string.model5Sort));
        cloudsModel5.setImageUrl(context.getString(R.string.model5ImageUri));
        cloudsModel5.setInformationUri(context.getString(R.string.model5Info));

        final CloudsModel cloudsModel6 = new CloudsModel();
        cloudsModel6.setTitle(context.getString(R.string.model6Title));
        cloudsModel6.setDescription(context.getString(R.string.model6Description));
        cloudsModel6.setSort(context.getString(R.string.model6Sort));
        cloudsModel6.setImageUrl(context.getString(R.string.model6ImageUri));
        cloudsModel6.setInformationUri(context.getString(R.string.model6InfoUri));

        final CloudsModel cloudsModel7 = new CloudsModel();
        cloudsModel7.setTitle(context.getString(R.string.model7Title));
        cloudsModel7.setDescription(context.getString(R.string.modelDescription));
        cloudsModel7.setSort(context.getString(R.string.model7Sort));
        cloudsModel7.setImageUrl(context.getString(R.string.model7ImageUri));
        cloudsModel7.setInformationUri(context.getString(R.string.model7Info));

        final CloudsModel cloudsModel8 = new CloudsModel();
        cloudsModel8.setTitle(context.getString(R.string.model8Title));
        cloudsModel8.setDescription(context.getString(R.string.model8Description));
        cloudsModel8.setSort(context.getString(R.string.model8Sort));
        cloudsModel8.setImageUrl(context.getString(R.string.model8ImageUri));
        cloudsModel8.setInformationUri(context.getString(R.string.model8Info));

        final CloudsModel cloudsModel9 = new CloudsModel();
        cloudsModel9.setTitle(context.getString(R.string.model9Title));
        cloudsModel9.setDescription(context.getString(R.string.model9Description));
        cloudsModel9.setSort(context.getString(R.string.model9Sort));
        cloudsModel9.setImageUrl(context.getString(R.string.model9ImageUri));
        cloudsModel9.setInformationUri(context.getString(R.string.model9InfoUri));

        final CloudsModel cloudsModel10 = new CloudsModel();
        cloudsModel10.setTitle(context.getString(R.string.model10Title));
        cloudsModel10.setDescription(context.getString(R.string.model10DescriptionUri));
        cloudsModel10.setSort(context.getString(R.string.model10Sort));
        cloudsModel10.setImageUrl(context.getString(R.string.model10ImageUri));
        cloudsModel10.setInformationUri(context.getString(R.string.model10InfoUri));

        final CloudsModel cloudsModel11 = new CloudsModel();
        cloudsModel11.setTitle(context.getString(R.string.model11Title));
        cloudsModel11.setDescription(context.getString(R.string.model11Description));
        cloudsModel11.setSort(context.getString(R.string.model11Sort));
        cloudsModel11.setImageUrl(context.getString(R.string.model11ImageUri));
        cloudsModel11.setInformationUri(context.getString(R.string.model11InfoUri));

        final CloudsModel cloudsModel12 = new CloudsModel();
        cloudsModel12.setTitle(context.getString(R.string.model12Title));
        cloudsModel12.setDescription(context.getString(R.string.model12Description));
        cloudsModel12.setSort(context.getString(R.string.model12Sort));
        cloudsModel12.setImageUrl(context.getString(R.string.model12ImageUri));
        cloudsModel12.setInformationUri(context.getString(R.string.model12InfoUri));

        cloudList.add(cloudsModel1);
        cloudList.add(cloudsModel2);
        cloudList.add(cloudsModel3);
        cloudList.add(cloudsModel4);
        cloudList.add(cloudsModel5);
        cloudList.add(cloudsModel6);
        cloudList.add(cloudsModel7);
        cloudList.add(cloudsModel8);
        cloudList.add(cloudsModel9);
        cloudList.add(cloudsModel10);
        cloudList.add(cloudsModel11);
        cloudList.add(cloudsModel12);
        return cloudList;
    }
}
